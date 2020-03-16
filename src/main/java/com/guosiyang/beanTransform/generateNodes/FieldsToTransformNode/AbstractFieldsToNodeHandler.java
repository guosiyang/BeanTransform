package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode;

import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.CommonGetMethodName;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.CommonSetMethodName;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.GetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.SetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransNodeBuilder;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName : AbstractFieldsToNode
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-26 22:13
 * @Think:为什么使用责任链 因为所有节点 不能即是a节点类型 也是b节点类型
 * 故当一个field需要生成节点对象时 它必然是单一的 故 使用责任链 进行处理
 * 切记在客户端 生成责任链时 必须进行责任链优先级考虑 把概率存在先处理的
 * 排在第一位
 */
public abstract class AbstractFieldsToNodeHandler {

    //下一个责任链
    protected AbstractFieldsToNodeHandler nextHandler;

    //生成的get方法的名称
    private GetMethodNameAble getMethodNameAble = new CommonGetMethodName();

    //生成的set方法名称
    private SetMethodNameAble setMethodNameAble = new CommonSetMethodName();


    /**
    * @Param
    * @description 处理方法 表示传入的字段 是否能进行处理
     * 如果不是此责任链则会返回null 如果此能处理则不会返回null
    * @author 郭思洋
    * @date 2020/2/26 22:19
    * @return
    */
    public abstract ObjectTransformNode deal(Field nowField, ObjectTransformNode parrentTransfromNode);

    public AbstractFieldsToNodeHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractFieldsToNodeHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
    * @Param
    * @description TODO
    * @author 郭思洋
    * @date 2020/3/16 1:56
    * @return  通用设计 所有节点都会走的设置方法
    */
    public ObjectTransNodeBuilder commonDeal (ObjectTransNodeBuilder o,Field nowField, ObjectTransformNode parrentTransfromNode){
        try {
            o.setConstructor(nowField.getType().getConstructor(null)).setNowField(nowField);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return o;
    }

    /**
    * @Param
    * @description TODO
    * @author 郭思洋
    * @date 2020/3/16 2:00
    * @return 无论什么方法都会走的getMethod 故放在了抽象类里面
    */
    public Method getGetMethod(Field nowField, ObjectTransformNode parrentTransfromNode){
        try {
            return parrentTransfromNode.getConstructor().getDeclaringClass().getMethod(getMethodNameAble.getMethodNameByClass(nowField),null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @Param
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/16 2:00
     * @return 无论什么方法都会走的getMethod 故放在了抽象类里面
     */
    public Method getSetMethod(Field nowField, ObjectTransformNode parrentTransfromNode){
        try {
            return parrentTransfromNode.getConstructor().getDeclaringClass().getMethod(setMethodNameAble.setMethodNameByClass(nowField),setMethodNameAble.setMethodParamters(nowField));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }


    public GetMethodNameAble getGetMethodNameAble() {
        return getMethodNameAble;
    }

    public void setGetMethodNameAble(GetMethodNameAble getMethodNameAble) {
        this.getMethodNameAble = getMethodNameAble;
    }

    public SetMethodNameAble getSetMethodNameAble() {
        return setMethodNameAble;
    }

    public void setSetMethodNameAble(SetMethodNameAble setMethodNameAble) {
        this.setMethodNameAble = setMethodNameAble;
    }
}
