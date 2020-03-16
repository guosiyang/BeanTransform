package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName;

import lombok.NonNull;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

/**
 * @ClassName : CommonSetMethodName
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-16 01:36
 * @Think: 该方法为通用实现 实现方法 针对非集合节点 使用set+Type
 * 对于集合节点 使用add+集合中的泛型的Type
 */
public class CommonSetMethodName implements SetMethodNameAble {
    @Override
    public String setMethodNameByClass(@NonNull Field field) {
        if (Collection.class.isAssignableFrom(field.getType())){
            Class type = setListGenericType(field);
            return "add" + type.getSimpleName();
        }
        return "get" + field.getType().getSimpleName();
    }

    @Override
    public Class<?> setMethodParamters(Field field) {
        if (Collection.class.isAssignableFrom(field.getType())){
            return setListGenericType(field);
        }
        return field.getType();
    }

    private Class setListGenericType(Field field){
        Class type = null;
        field.setAccessible(true);
        Type genericType = field.getGenericType();
        if (genericType instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) genericType;
            // 得到泛型里的class类型对象
            type = (Class<?>) pt.getActualTypeArguments()[0];
        }
        return type;
    }

}
