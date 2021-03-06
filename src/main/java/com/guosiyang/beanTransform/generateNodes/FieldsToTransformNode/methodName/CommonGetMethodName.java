package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName;

import com.google.common.base.CaseFormat;
import lombok.NonNull;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

/**
 * @ClassName : CommonGetMethodName
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-16 01:34
 * @Think: 该方法为通用实现 实现方法 对于非集合类型获取field的类型的简单名字 加上get
 * 集合类型 获取字段名称 首字母大写 加上get
 */
public class CommonGetMethodName implements GetMethodNameAble {


    private final static class Holder {
        public final static CommonGetMethodName single = new CommonGetMethodName();
    }

    public static CommonGetMethodName getInstance(){
        return Holder.single;
    }

    private CommonGetMethodName(){}

    @Override
    public String getMethodNameByClass(@NonNull Field field) {
        if (Collection.class.isAssignableFrom(field.getType())) {
            return "get" + CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, field.getName());
        }
        return "get" + field.getType().getSimpleName();
    }



}
