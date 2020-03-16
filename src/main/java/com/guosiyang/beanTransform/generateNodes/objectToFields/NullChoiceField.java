package com.guosiyang.beanTransform.generateNodes.objectToFields;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName : NullChoiceField
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-24 23:49
 * @Think:该类为空策略(什么都不处理 进行来的是什么直接送走什么) 我们同时对于策略我们应该通过工厂控制
 */
public class NullChoiceField implements ChoiceFieldsAble {

    @Override
    public ArrayList<Field> screenFields(ArrayList<Field> screenedFields) {
        return screenedFields;
    }

}
