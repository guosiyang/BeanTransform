package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName;

import java.lang.reflect.Field;

/**
 * @ClassName : SetMethodNameAble
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-16 01:28
 * @Think: 该接口主要表明 我们通过当前节点 找到对应父类节点中的set方法的方法名称 在通过反射拿到方法
 */
public interface SetMethodNameAble {

    /**
     * @Param
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/16 1:26
     * @return 通过比如传入集合类型 等等生成get方法名称
     * 比如 对于集合节点 他的get方法就是getxxx 但是对于set来讲 我们得是addxxx (通常)
     */
    public String setMethodNameByClass(Field field);

    /**
     * @Param
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/16 2:04
     * @return 对于set方法 有些时候生成set的方法参数易是如此 需要声明
     */
    public Class<?> setMethodParamters(Field field);
}
