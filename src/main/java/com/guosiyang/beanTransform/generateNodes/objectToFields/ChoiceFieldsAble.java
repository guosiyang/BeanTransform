package com.guosiyang.beanTransform.generateNodes.objectToFields;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @ClassName : ChoiceFieldsAble
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-24 23:37
 * @Think: 该接口主要是针对 比如数据库对象传入时 我们通过反射进行筛选所有字段
 * 但像有的生成的数据库对象 里面 会存有该表中有多少个字段数量 等字段 就是属于不应该解析的字段
 * 我们可以使用此接口
 */
@FunctionalInterface
public interface ChoiceFieldsAble {
    public ArrayList<Field> screenFields(ArrayList<Field> screenedFields);
}
