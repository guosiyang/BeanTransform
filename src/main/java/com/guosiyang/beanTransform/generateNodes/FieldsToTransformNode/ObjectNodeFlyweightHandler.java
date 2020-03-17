package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode;

import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.GetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.SetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransNodeBuilder;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;
import com.guosiyang.beanTransform.util.TypeJudgeUtil;

import java.lang.reflect.Field;
import java.util.Collection;

/**
 * @ClassName : ObjectNodeHandler
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-17 00:30
 * @Think: 普通对象节点的生成transformNode 对应的CommonTransformNode
 * 判断逻辑 如果当前节点父节点参数没传 并且 不是根节点 也不是集合节点 则认为其是CommonTransformNode
 */
public class ObjectNodeFlyweightHandler extends AbstractFieldsToNodeFlyweightHandler {

    public ObjectNodeFlyweightHandler(){}

    public ObjectNodeFlyweightHandler(GetMethodNameAble getMethodNameAble,SetMethodNameAble setMethodNameAble){
        super(getMethodNameAble,setMethodNameAble);
    }

    @Override
    public ObjectTransformNode deal(Field nowField, ObjectTransformNode parrentTransfromNode,Class thisClass) {
        if (!TypeJudgeUtil.isStringOrBasicType(nowField.getType()) && parrentTransfromNode!=null &&
                !Collection.class.isAssignableFrom(nowField.getType())){
            ObjectTransNodeBuilder o = new ObjectTransNodeBuilder(ObjectTransNodeBuilder.TransNodeType.COMMON);
            commonDeal(o, nowField, parrentTransfromNode);
            o.setPolicyWay(parrentTransfromNode.getPojoWay() + "|" + nowField.getType().getSimpleName()).
                    setParentNode(parrentTransfromNode).
                    setSetMethod(getSetMethod(nowField, parrentTransfromNode)).
                    setGetMethod(getGetMethod(nowField, parrentTransfromNode));
            return o.getResult();
        }
        if (nextHandler == null){
            return null;
        }
        return nextHandler.deal(nowField,parrentTransfromNode,thisClass);
    }
}
