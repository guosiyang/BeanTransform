package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode;

import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;

import java.lang.reflect.Field;

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
}
