package com.guosiyang.beanTransform.generateNodes.transformNodes;

import com.sun.org.apache.regexp.internal.RE;
import lombok.NonNull;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName : ObjectTransNodeBuilder
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-02 10:21
 * @Think:为什么要设计此类 我是觉得 正常的get/set写代码真的好丑
 * 我喜欢那种流水式写代码的风格 例如原来是 a.setxxx(); a.setzzz(); a.setccc();
 * 现在使用这个 就可以 a.setxxx().setzzz.setxxx().getresult(); 返回结果
 * 切初始化之后坚决不允许进行修改对象地址
 */
public class ObjectTransNodeBuilder {

    final ObjectTransformNode transformNode;


    public static enum TransNodeType {
        //该四种类型值得是四种Object类型
        FINAL, LIST, ROOT, COMMON;

        public ObjectTransformNode getInstance() {
            switch (this) {
                case FINAL:
                    return new FianlTransformNode();
                case LIST:
                    return new ListTransformNode();
                case ROOT:
                    return new RootTransformNode();
                case COMMON:
                    return new CommonTransformNode();
                default:
                    return new ObjectTransformNode();
            }
        }
    }

    public ObjectTransNodeBuilder(TransNodeType transNodeType) {
        this(transNodeType.getInstance());
    }

    public ObjectTransNodeBuilder(@NonNull ObjectTransformNode transformNode) {
        this.transformNode = transformNode;
    }

    public ObjectTransNodeBuilder setInPOJOOPosition(@NonNull String inPOJOOPosition){
        transformNode.setInPOJOOPosition(inPOJOOPosition);
        return this;
    }

    public ObjectTransNodeBuilder setConstructor(@NonNull Constructor constructor){
        transformNode.setConstructor(constructor);
        return this;
    }

    public ObjectTransNodeBuilder setPolicyWay(@NonNull String policyWay){
        transformNode.setPojoWay(policyWay);
        return this;
    }

    public ObjectTransNodeBuilder setGetMethod(@NonNull Method getMethod){
        transformNode.setGetMethod(getMethod);
        return this;
    }

    public ObjectTransNodeBuilder setSetMethod(@NonNull Method setMethod){
        transformNode.setSetMethod(setMethod);
        return this;
    }

    public ObjectTransNodeBuilder setNowField(@NonNull Field nowField){
        transformNode.setNowField(nowField);
        return this;
    }

    public ObjectTransNodeBuilder setParentNode(@NonNull ObjectTransformNode parentNode){
        transformNode.setParentNode(parentNode);
        return this;
    }

    public ObjectTransNodeBuilder addSonNode(@NonNull ObjectTransformNode sonNodes) {
        transformNode.addSonNodes(sonNodes);
        return this;
    }

    public ObjectTransNodeBuilder setNowPostion(String nowPostion){
        transformNode.setNowInPOJOPosition(nowPostion);
        return this;
    }

    public ObjectTransformNode getResult(){
        return transformNode;
    }



}
