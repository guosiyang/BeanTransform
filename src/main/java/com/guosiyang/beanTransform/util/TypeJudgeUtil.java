package com.guosiyang.beanTransform.util;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import lombok.NonNull;
import org.junit.Test;

/**
 * @ClassName : TypeJudgeUtil
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-14 21:37
 * @Think: 该类主要是提供类型判断相关支持
 */
public class TypeJudgeUtil {

    //八大基本数据类型极其包装类class
    final static Class[] BASIC_TYPE = new Class[]{Byte.TYPE, Byte.class, Short.TYPE, Short.class,
            Integer.TYPE, Integer.class, Long.TYPE, Long.class,
            Float.TYPE, Float.class, Double.TYPE, Double.class,
            Boolean.TYPE, Boolean.class, Character.TYPE, Character.class};

    final static Class STRING_Type = String.class;
    /**
     * @return 该方法主要是进行对class进行判断是否为基本数据类型及其包装类
     * @Param
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/14 21:39
     */
    public static boolean isVBasicAndOackType(@NonNull Class judgeType) {
        for (Class basic:
             BASIC_TYPE) {
            if (basic == judgeType){
                return true;
            }
        }
        return false;
    }

    /**
    * @Param
    * @description TODO
    * @author 郭思洋
    * @date 2020/3/14 22:04
    * @return 判断是否为String类型
    */
    public static boolean isStringType(@NonNull Class judgeType){
        if (judgeType == STRING_Type){
            return true;
        }
        return false;
    }

    /**
    * @Param
    * @description TODO
    * @author 郭思洋
    * @date 2020/3/14 22:07
    * @return 判断是否为基本数据类型极其包装类 以及string
    */
    public static boolean isStringOrBasicType(@NonNull Class judgeType){
        return isStringType(judgeType) && isVBasicAndOackType(judgeType);
    }

}
