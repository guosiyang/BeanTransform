package com.guosiyang.beanTransform;

import com.google.common.collect.Lists;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.CommonGetMethodName;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.CommonSetMethodName;
import com.guosiyang.beanTransform.generateNodes.POJOTranContrain;
import com.guosiyang.beanTransform.generateNodes.objectToFields.ChoiceFieldSingleContainer;
import com.guosiyang.beanTransform.util.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName : POJOTransform
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-23 22:07
 * @Think: 该类是对外暴露执行pojo(dataObj, 报文, bean之间的相互转换)
 */
public class POJOTransformUtil {

    private final static Logger logger = LoggerFactory.getLogger(POJOTransformUtil.class);

    /**
     * @return
     * @Param
     * @description 该方法是一个POJO对象转换成传入的class对象
     * 处理逻辑 不进行校验 而直接调用pOJOsToPOJOs方法
     * 因为校验都放在这个重载方法里面 没有因为这个方法而需要的特殊校验
     * 如果返回数组为空 直接返回空
     * @author 郭思洋
     * @date 2020/3/15 3:01
     */
    public static Object pOJOToPOJO(Object in, Class out) {
        return pOJOsToPOJO(new Object[]{in},out);
    }

    /**
     * @return
     * @Param
     * @description 多个POJO对象生成转换成一个class对象 同理校验在
     * pOJOsToPOJOs(ArrayList<POJOTranContrain> inList, ArrayList<POJOTranContrain> outList);里面
     * @author 郭思洋
     * @date 2020/3/15 20:16
     */
    public static Object pOJOsToPOJO(Object[] in, Class out) {
        Object[] objects = pOJOsToPOJOs(getPOJOTranListByObj(in), getPOJOTranListByClass(new Class[]{out}));
        return checkObjectsIsNull(objects);
    }

    /**
    * @Param
    * @description 1个对象变成多个对象
    * @author 郭思洋
    * @date 2020/3/15 21:11
    * @return
    */
    public static Object[] POJOToPOJOs(Object in,Class[] out){
        return pOJOsToPOJOs(getPOJOTranListByObj(new Object[]{in}), getPOJOTranListByClass(out));
    }

    /**
    * @Param
    * @description TODO
    * @author 郭思洋
    * @date 2020/3/15 20:38
    * @return   所想要转换的a对象内某些节点已经存在 然后我们想把b对象,c对象的某些节点补充到a对象上
     * 说白了a对象的其他节点不发生变化
    */
    public static Object pOJOsToObject(Object[] in, Object out){
        Object[] objects = pOJOsToPOJOs(getPOJOTranListByObj(in), getPOJOTranListByObj(new Object[]{out}));
        return checkObjectsIsNull(objects);
    }

    /**
     * @Param
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/15 20:38
     * @return   还是调用的pOJOsToObject无非就是 传入的是一个对象的区别
     */
    public static Object pOJOToObject(Object in, Object out){
        return pOJOsToObject(new Object[]{in},out);
    }

    /**
     * @return
     * @Param
     * @description 多个报文对象生成  第一 这是初版 目前不支持多转多
     * 仅仅只支持 1转多 多转1 1转1
     *
     * @author 郭思洋
     * @date 2020/3/14 23:43
     */
    public static Object[] pOJOsToPOJOs(ArrayList<POJOTranContrain> inList, ArrayList<POJOTranContrain> outList) {
        List<POJOTranContrain> availIn = new ArrayList<>();
        List<POJOTranContrain> availOut = new ArrayList<>();
        logger.info("传入对象数组为 : " + inList.toString() + "传出对象数组为 : " + inList.toString());
        if (inList == null || outList == null || inList.size() == 0 ||
                outList.size() == 0 || (outList.size() != 1 && inList.size() != 1)) {
            throw new ExpectedException("暂不支持多对多");
        }
        /**
         * inList->筛选不为空->添加进availIn
         */
        inList.stream().filter(in -> {
            if (in.getTransObject() == null)
                return false;
            return true;
        }).forEach(in -> {
            availIn.add(in);
        });
        /**
         * outList->筛选不为空->添加进availOut
         */
        outList.stream().filter(out -> {
            if (out.getTransObject() == null || out.getObjectClass() == null)
                return false;
            return true;
        }).forEach(out -> {
            availOut.add(out);
        });
        if (availIn.size() == 0 || availOut.size() == 0) {
            throw new ExpectedException("输入对象组或者输出对象组没有可用对象组 请确认 对于输入对象组 obj对象不能都为空 对于输出对象组 class或者对象不能同时为空");
        }
        List<POJOTranContrain> sum = Lists.newArrayList(availIn);
        sum.addAll(availOut);
        /**
         * POJOTranContrain -> 晒选出为null的节点策略 并置为null策略
         *                  -> 筛选出GetMethodNameAble为null 并置为简单地首 字母大写 加上get的策略
         *                  -> 筛选出SetMethodNameAble为null 并置为简单地首 非集合类型为 set + 首字母大写 , 集合类型为add+实体类名称 的默认策略
         */
        sum.stream().map(p -> {
            if (p.getChoiceFieldsAble() == null)
                p.setChoiceFieldsAble(ChoiceFieldSingleContainer.getInstance().getTByType("NULL"));
            if (p.getGetMethodNameAble() == null)
                p.setGetMethodNameAble(CommonGetMethodName.getInstance());
            if (p.getSetMethodNameAble() == null)
                p.setSetMethodNameAble(CommonSetMethodName.getInstance());
            return p;
        });
        logger.info("筛选之后传入对象数组为 : " + availIn.toString() + "筛选之后传出对象数组为 : " + availOut.toString());
        logger.info("校验成功 进入生成节点");
        TransformOperator transformOperator =new TransformOperator();
        return transformOperator.pojosTopojos(availIn,availOut);
    }

    /**
     * @return
     * @Param 该方法主要是进行传入的class进行生成相关的POJOTranContrain的集合(就是把里面的object节点进行赋值)
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/15 20:35
     */
    public static ArrayList<POJOTranContrain> getPOJOTranListByObj(Object[] objects) {
        ArrayList<POJOTranContrain> opojos = new ArrayList<>();
        for (Object o :
                objects) {
            POJOTranContrain p = new POJOTranContrain();
            p.setTransObject(o);
            opojos.add(p);
        }
        return opojos;
    }

    /**
     * @return
     * @Param
     * @description 该方法主要是进行传入的class进行生成相关的POJOTranContrain的集合(就是把里面的class节点进行赋值)
     * @author 郭思洋
     * @date 2020/3/15 20:33
     */
    public static ArrayList<POJOTranContrain> getPOJOTranListByClass(Class[] objects) {
        ArrayList<POJOTranContrain> opojos = new ArrayList<>();
        for (Class o :
                objects) {
            POJOTranContrain p = new POJOTranContrain();
            p.setObjectClass(o);
            opojos.add(p);
        }
        return opojos;
    }

    /**
     * @return 该方法主要是针对当转换之后为一个对象是进行非null校验
     * @Param
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/15 20:31
     */
    private static Object checkObjectsIsNull(Object[] objects) {
        return Optional.ofNullable(objects).filter(objects1 -> {
            return objects1[0] != null;
        }).map(objects1 -> objects1[0]).orElse(null);
    }
}
