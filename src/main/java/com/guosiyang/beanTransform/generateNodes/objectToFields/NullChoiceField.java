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
 * @Think:该类为空策略 我们同时对于策略我们应该通过工厂控制
 */
public class NullChoiceField implements ChoiceFieldsAble {

    @Override
    public ArrayList<Field> screenFields(ArrayList<Field> screenedFields) {
        return null;
    }
    @Test
    public void ss(){
        Pattern pattern = Pattern.compile(".*\\$Lambda\\$.*");
        Matcher matcher = pattern.matcher("class com.guosiyang.beanTransform.generateNodes.objectToFields.NullChoiceField$$Lambda$1/992136656");
        System.out.println( matcher.matches());
    }
}
