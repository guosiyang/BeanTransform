package com.guosiyang.beanTransform.generateNodes.objectToFields;

import com.guosiyang.beanTransform.util.CacheTSingleContainer;

/**
 * @ClassName : ChoiceFieldSingleFactory
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-25 00:31
 * @Think: 针对ChoiceFieldAble接口设计的单例工厂
 */
public class ChoiceFieldSingleContainer extends CacheTSingleContainer<ChoiceFieldsAble> {

    private ChoiceFieldSingleContainer() {
    }

    public static CacheTSingleContainer<ChoiceFieldsAble> getInstance() {
        if (singleFactory == null) {
            synchronized (ChoiceFieldSingleContainer.class) {
                singleFactory = new ChoiceFieldSingleContainer();
                ((ChoiceFieldSingleContainer) singleFactory).init();
            }
        }
        return (CacheTSingleContainer<ChoiceFieldsAble>)singleFactory;
    }

    @Override
    protected boolean init() {
        KToT.put("NULL", new NullChoiceField());
        logger.info("添加ChoiceFieldAble的null策略成功");
        return true;
    }
}
