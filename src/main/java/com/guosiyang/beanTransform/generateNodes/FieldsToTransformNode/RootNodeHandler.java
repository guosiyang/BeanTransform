package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode;

import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;

import java.lang.reflect.Field;

/**
 * @ClassName : RootNodeHandler
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-26 22:27
 * @Think: 根节点对应的责任处理
 */
public class RootNodeHandler extends AbstractFieldsToNodeHandler {
    @Override
    public ObjectTransformNode deal(Field nowField, ObjectTransformNode parrentTransfromNode) {
        return null;
    }
}
