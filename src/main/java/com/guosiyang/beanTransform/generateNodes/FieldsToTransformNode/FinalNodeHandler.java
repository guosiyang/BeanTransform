package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode;

import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;

import java.lang.reflect.Field;
import java.util.Optional;

/**
 * @ClassName : FinalNodeHandler
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-26 22:24
 * @Think: 最终节点对应的责任处理
 */
public class FinalNodeHandler extends AbstractFieldsToNodeHandler{

    @Override
    public ObjectTransformNode deal(Field nowField, ObjectTransformNode parrentTransfromNode) {
        if (nowField == null || parrentTransfromNode == null){
            return null;
        }
        return null;
    }
}
