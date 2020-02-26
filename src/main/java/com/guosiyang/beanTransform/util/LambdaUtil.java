package com.guosiyang.beanTransform.util;

import java.util.regex.Pattern;

/**
 * @ClassName : LambdaUtil
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-25 15:03
 * @Think: 该类主要是进行lambda相关操作的工具类
 */
public class LambdaUtil {

    private static Pattern matchLambda = Pattern.compile(".*\\$Lambda\\$.*");

    /**
    * @Param
    * @description 该方法主要是进行判断该类是否是有lambda表达式生成的类
    * @author 郭思洋
    * @date 2020/2/25 15:07
    * @return
    */
    public static boolean isLambdaClass(String className){
        if (className == null || "".equals(className)){
            return false;
        }
        return matchLambda.matcher(className).matches();
    }
}
