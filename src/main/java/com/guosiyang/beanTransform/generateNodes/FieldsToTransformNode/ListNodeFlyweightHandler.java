package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode;

import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.GetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.SetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransNodeBuilder;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;

import java.lang.reflect.Field;
import java.util.Collection;

/**
 * @ClassName : ListNodeHANDLER
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-26 22:25
 * @Think:list节点对应的生成的ListTransformNode 判断逻辑 如果当前对象类型是以collection接口的实现类 则认为其是list节点
 */
public class ListNodeFlyweightHandler extends AbstractFieldsToNodeFlyweightHandler {

    public ListNodeFlyweightHandler(GetMethodNameAble getMethodNameAble, SetMethodNameAble setMethodNameAble) {
        super(getMethodNameAble, setMethodNameAble);
    }

    public ListNodeFlyweightHandler() {
    }

    @Override
    public ObjectTransformNode deal(Field nowField, ObjectTransformNode parrentTransfromNode, Class thisClass) {
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
        return nextHandler.deal(nowField, parrentTransfromNode, thisClass);
    }
}