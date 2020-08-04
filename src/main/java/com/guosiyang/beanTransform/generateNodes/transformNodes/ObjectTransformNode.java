package com.guosiyang.beanTransform.generateNodes.transformNodes;

import com.google.common.base.Objects;
import com.guosiyang.beanTransform.util.ParentToSonStruct;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.lang.reflect.Constructor;
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
@NoArgsConstructor
public class ObjectTransformNode extends ParentToSonStruct implements IsTransformNode {

    //该属性是指当前被解析根对象的类路径
    @Getter
    private String pojoWay;

    //指的是在POJO中在跟对象的位置 通过这个跟pojoWay可以确定唯一节点
    @Getter
    private String inPOJOOPosition;

    //值得是当前位置的报文节点类型
    // 比如 inPOJOPastion为 : Policy|A|B 则 nowInPOJOPosition为B
    @Getter
    @Setter
    private String nowInPOJOPosition;


    //对于java对象 我们必然会有他的创建构造器
    @Getter
    private Constructor constructor;

    //提供得到当前节点的父节点的对于当前节点的访问方法
    @Getter
    private Method getMethod;

    //提供得到当前节点的父节点的对于当前节点的设置方法
    @Getter
    private Method setMethod;

    //因为所有的当前节点 都是父类节点中的对象 故 该字段存的是父类节点中的field信息
    // 我可以通过这个拿到当前节点的例如 注解信息等 以作备用
    @Getter
    private Field nowField;

    @Override
    /**
     * @Param
     * @description 主要是针对java对象的解析节点生成唯一标识符
     * @author 郭思洋
     * @date 2020/2/23 23:47
     * @return java.lang.String
     */

    public String getOnlySignPath() {
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

    public void setPojoWay(@NonNull String pojoWay) {
        this.pojoWay = pojoWay;
    }

    public void setInPOJOOPosition(@NonNull String inPOJOOPosition) {
        this.inPOJOOPosition = inPOJOOPosition;
    }

    @Override
    public void setSetMethod(@NonNull Method method) {
        this.setMethod = method;
        return;
    }

    @Override
    public void setGetMethod(@NonNull Method method) {
        this.getMethod = method;
    }

    public void setConstructor(@NonNull Constructor constructor) {
        this.constructor = constructor;
    }

    public void setNowField(@NonNull Field nowField){
        this.nowField = nowField;
    }
}
