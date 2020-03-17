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
 * 注意 : 该所有实现子类对应的都是生成TransformNode对象
 * 同时 针对此对象 我们get/set使用享元模式
 * (目前来讲 我们的生成对象节点仅仅有出这四种  但get/setMethod我们是无法知道如何变化(可能是外部传入)
 * 故我们把GetMethodNameAble/SetMethodNameAble抽象 作为可变 生成享元模式)
 */
public abstract class AbstractFieldsToNodeFlyweightHandler {

    //下一个责任链
    protected AbstractFieldsToNodeFlyweightHandler nextHandler;

    //生成的get方法的名称
    private GetMethodNameAble getMethodNameAble = new CommonGetMethodName();

    //生成的set方法名称
    private SetMethodNameAble setMethodNameAble = new CommonSetMethodName();


    public AbstractFieldsToNodeFlyweightHandler(GetMethodNameAble getMethodNameAble, SetMethodNameAble setMethodNameAble) {
        this.getMethodNameAble = getMethodNameAble;
        this.setMethodNameAble = setMethodNameAble;
    }

    public AbstractFieldsToNodeFlyweightHandler() {
    }

    /**
     * @return
     * @Param
     * @description 处理方法 表示传入的字段 是否能进行处理
     * 如果不是此责任链则会返回null 如果此能处理则不会返回null
     * @author 郭思洋
     * @date 2020/2/26 22:19
     */
    public abstract ObjectTransformNode deal(Field nowField, ObjectTransformNode parrentTransfromNode, Class thisClass);

    protected void setNextHandler(AbstractFieldsToNodeFlyweightHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * @return 通用设计 所有节点都会走的设置方法
     * @Param
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/16 1:56
     */
    protected ObjectTransNodeBuilder commonDeal(ObjectTransNodeBuilder o, Field nowField, ObjectTransformNode parrentTransfromNode) {
        try {
            o.setConstructor(nowField.getType().getConstructor(null)).setNowField(nowField);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return o;
    }

    /**
     * @return 无论什么方法都会走的getMethod 故放在了抽象类里面
     * @Param
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/16 2:00
     */
    protected Method getGetMethod(Field nowField, ObjectTransformNode parrentTransfromNode) {
        try {
            return parrentTransfromNode.getConstructor().getDeclaringClass().getMethod(getMethodNameAble.getMethodNameByClass(nowField), null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @return 无论什么方法都会走的getMethod 故放在了抽象类里面
     * @Param
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/16 2:00
     */
    protected Method getSetMethod(Field nowField, ObjectTransformNode parrentTransfromNode) {
        try {
            return parrentTransfromNode.getConstructor().getDeclaringClass().getMethod(setMethodNameAble.setMethodNameByClass(nowField), setMethodNameAble.setMethodParamters(nowField));
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
