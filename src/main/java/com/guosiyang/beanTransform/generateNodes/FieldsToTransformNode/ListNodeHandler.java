package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode;

import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransNodeBuilder;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;

import java.lang.reflect.Field;
import java.util.Collection;

/**
 * @ClassName : ListNodeHANDLER
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-26 22:25
 * @Think:list节点对应的责任处理
 */
public class ListNodeHandler extends AbstractFieldsToNodeHandler {
    @Override
    public ObjectTransformNode deal(Field nowField, ObjectTransformNode parrentTransfromNode) {
        if (Collection.class.isAssignableFrom(nowField.getType())) {
            ObjectTransNodeBuilder o = new ObjectTransNodeBuilder(ObjectTransNodeBuilder.TransNodeType.LIST);
            commonDeal(o, nowField, parrentTransfromNode);
            o.setPolicyWay(parrentTransfromNode.getPojoWay() + "|" + nowField.getType().getSimpleName()).
                    setParentNode(parrentTransfromNode).
                    setSetMethod(getSetMethod(nowField, parrentTransfromNode)).
                    setGetMethod(getGetMethod(nowField, parrentTransfromNode));
            return o.getResult();
        }
        if (nextHandler == null) {
            return null;
        }
        return nextHandler.deal(nowField, parrentTransfromNode);
    }
}
