package com.guosiyang.beanTransform.generateNodes.objectToFields;

import com.google.common.collect.Lists;
import lombok.NonNull;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @ClassName : ObjectToFieldsOperator
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-15 23:55
 * @Think: 该类主要是针对传入的class进行拆分返回 成field
 */
public class ClassToFieldsOperator {

    ChoiceFieldsAble choiceFieldsAble;

    public ClassToFieldsOperator(@NonNull ChoiceFieldsAble choiceFieldsAble){
        this.choiceFieldsAble = choiceFieldsAble;
    }

    /**
    * @Param
    * @description TODO
    * @author 郭思洋
    * @date 2020/3/16 0:00
    * @return   通过选择器进行对传入的class进行筛选
    */
    public ArrayList<Field> classToFields(@NonNull Class c){
        Field[] fields =  c.getFields();
        ArrayList<Field> filedSList=Lists.newArrayList(fields);
        return choiceFieldsAble.screenFields(filedSList);
    }
}
