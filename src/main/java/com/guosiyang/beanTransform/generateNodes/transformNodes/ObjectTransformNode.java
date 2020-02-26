package com.guosiyang.beanTransform.generateNodes.transformNodes;

import com.google.common.base.Objects;
import jdk.nashorn.internal.objects.annotations.Constructor;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Optional;

/**
 * @ClassName : AbstractObjectTransformNode
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-23 22:49
 * @Think: 为什么设计该类 主要是 针对 所有java类 我们可以根据类的路径 以及子节点在父节点的位置
 * 确定 一个节点的绝对位置 比如 a对象的 类路径为 com.ss.AA AA对象下有3个属性 b,c,d
 * 则确定 b的 位置 需要 2个变量 一个为AA对象的路径 以及 AA|b 表示 AA对象的b属性 同理 类推
 * 但对于 我想扩展的 比如基于porperties文件生成报文 等等 properties的节点 就不能继承该类(可能将在版本2进行更新扩展)
 */
public  class ObjectTransformNode implements IsTransformNode {

    //该属性是指当前被解析根对象的类路径
    private String pojoWay;

    //指的是在POJO中在跟对象的位置 通过这个跟pojoWay可以确定唯一节点
    private String inPOJOOPosition;

    //对于java对象 我们必然会有他的创建构造器
    private Constructor constructor;

    //提供得到当前节点的父节点的对于当前节点的访问方法
    private Method getMethod;

    //提供得到当前节点的父节点的对于当前节点的设置方法
    private Method setMethod;

    //因为所有的当前节点 都是父类节点中的对象 故 该字段存的是父类节点中的field信息
    // 我可以通过这个拿到当前节点的例如 注解信息等 以作备用
    private Field nowField;

    //存放当前节点的父节点
    private ObjectTransformNode parentNode;

    //存放当前节点的子节点
    private HashSet<ObjectTransformNode> sonNodes = new HashSet<>();

    public ObjectTransformNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(ObjectTransformNode parentNode) {
        if(Optional.ofNullable(parentNode).isPresent()){
            this.setParentNode(parentNode);
            if (!parentNode.getSonNodes().contains(this)){
                parentNode.addSonNodes(this);
            }
        }
        throw new NullPointerException("传入要插入的父节点为空");
    }

    public HashSet<ObjectTransformNode> getSonNodes() {
        return sonNodes;
    }

    public void addSonNodes(ObjectTransformNode sonNodes) {
        if(Optional.ofNullable(sonNodes).isPresent()){
            this.sonNodes.add(sonNodes);
            sonNodes.setParentNode(this);
            return;
        }
        throw new NullPointerException("传入要插入的子节点为空");
    }

    @Override
    /**
     * @Param
     * @description 主要是针对java对象的解析节点生成唯一标识符
     * @author 郭思洋
     * @date 2020/2/23 23:47
     * @return java.lang.String
     */
    public String getOnlySign() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("JAVA policyWay:").append(pojoWay).
                append(" postation:").append(inPOJOOPosition);
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectTransformNode that = (ObjectTransformNode) o;
        return Objects.equal(pojoWay, that.pojoWay) &&
                Objects.equal(inPOJOOPosition, that.inPOJOOPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pojoWay, inPOJOOPosition);
    }

    public String getPojoWay() {
        return pojoWay;
    }

    public void setPojoWay(String pojoWay) {
        if (!Optional.ofNullable(pojoWay).isPresent()){
            this.pojoWay = pojoWay;
            return;
        }
        throw new NullPointerException("传入的对象路径为空");
    }

    public String getInPOJOOPosition() {
        return inPOJOOPosition;
    }

    public void setInPOJOOPosition(String inPOJOOPosition) {
        if (!Optional.ofNullable(inPOJOOPosition).isPresent()){
            this.inPOJOOPosition = inPOJOOPosition;
            return;
        }
        throw new NullPointerException("传入的对象中路径为空");
    }


    public Constructor getConstructor() {
        return constructor;
    }

    @Override
    public Method getSetMethod() {
        throw new UnsupportedOperationException("根节点不能有get跟set方法");
    }

    @Override
    public void setSetMethod(Method method) {
        if (!Optional.ofNullable(method).isPresent()){
            this.setMethod = method;
            return;
        }
        throw new NullPointerException("传入的设置方法为空");
    }

    @Override
    public Method getGetMethod() {
        throw new UnsupportedOperationException("根节点不能有get跟set方法");
    }

    @Override
    public void setGetMethod(Method method) {
        if (!Optional.ofNullable(method).isPresent()){
            this.getMethod = method;
            return;
        }
        throw new NullPointerException("传入的得到方法为空");
    }


    public void setConstructor(Constructor constructor) {
        if (!Optional.ofNullable(constructor).isPresent()){
            this.constructor = constructor;
            return;
        }
        throw new NullPointerException("传入的构造器为空");
    }
}
