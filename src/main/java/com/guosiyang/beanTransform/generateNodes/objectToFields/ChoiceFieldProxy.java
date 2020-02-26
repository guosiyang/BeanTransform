package com.guosiyang.beanTransform.generateNodes.objectToFields;

import com.guosiyang.beanTransform.util.AbStractSingleFactory;
import com.guosiyang.beanTransform.util.LambdaUtil;

import java.util.regex.Pattern;

/**
 * @ClassName : 该类主要提为访问单例工厂提供代理类
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-25 16:32
 * @Think:
 */
public class ChoiceFieldProxy {

    private static final AbStractSingleFactory<ChoiceFieldsAble> SINGLE_FACTORY = ChoiceFieldSingleFactory.getInstance();

    /**
    * @Param
    * @description 该方法主要是针对传入的choiceFieldAble提供预加载
     *             下回我们可以直接拿着string获取策略对象
     *             但我们对于lambda表达式生成的类不进行存储
    * @author 郭思洋
    * @date 2020/2/26 10:58
    * @return
    */
    public String addChioceFieldAbleCache(ChoiceFieldsAble choiceFieldsAble){
        if (LambdaUtil.isLambdaClass(choiceFieldsAble.getClass().getSimpleName())){
            return null;
        }
        Class<? extends ChoiceFieldsAble> choiceClass = choiceFieldsAble.getClass();
        String className = choiceClass.getName();
        if ( ! SINGLE_FACTORY.isExistType(className)){
            SINGLE_FACTORY.insertT(choiceClass.getName(),choiceFieldsAble);
        }
        return className;
    }

    /**
    * @Param 该类主要是进行通过类型获取接口实现类
    * @description TODO 
    * @author 郭思洋
    * @date 2020/2/26 15:13 
    * @return   
    */
    public ChoiceFieldsAble getChoiceByString(String type){
        if (SINGLE_FACTORY.isExistType(type)){
            return SINGLE_FACTORY.getTByType(type);
        }
        return null;
    }

    public boolean isExistType(String type){
        return SINGLE_FACTORY.isExistType(type);
    }
}
