package com.guosiyang.beanTransform.generateNodes.objectToFields;

import com.guosiyang.beanTransform.util.AbStractSingleFactory;

/**
 * @ClassName : ChoiceFieldSingleFactory
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-25 00:31
 * @Think: 针对ChoiceFieldAble接口设计的单例工厂
 */
public class ChoiceFieldSingleFactory extends AbStractSingleFactory<ChoiceFieldsAble> {

    private ChoiceFieldSingleFactory() {
    }

    public static AbStractSingleFactory<ChoiceFieldsAble> getInstance() {
        if (singleFactory == null) {
            synchronized (ChoiceFieldSingleFactory.class) {
                singleFactory = new ChoiceFieldSingleFactory();
                ((ChoiceFieldSingleFactory) singleFactory).init();
            }
        }
        return singleFactory;
    }

    @Override
    protected boolean init() {
        stringToT.put("NULL", new NullChoiceField());
        logger.info("添加ChoiceFieldAble的null策略成功");
        return true;
    }
}
