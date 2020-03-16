package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName;

import lombok.NonNull;

import java.lang.reflect.Field;

/**
 * @ClassName : CommonGetMethodName
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-16 01:34
 * @Think: 该方法为通用实现 实现方法 获取field的类型的简单名字 加上get
 */
public class CommonGetMethodName implements GetMethodNameAble {

    @Override
    public String getMethodNameByClass(@NonNull Field field) {
        return "get" + field.getType().getSimpleName();
    }
}
