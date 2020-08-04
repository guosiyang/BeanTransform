package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode;

import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.GetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.SetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransNodeBuilder;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;
import com.guosiyang.beanTransform.util.TypeJudgeUtil;

import java.lang.reflect.Field;

/**
 * @ClassName : FinalNodeHandler
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-26 22:24
 * @Think: 最终节点对应的生成的对象FianlTransformNode
 * 判断逻辑 如果当前对象类型是基本数据类型极其包装类或者是string 则认为其是fianl节点
 */
public class FinalNodeFlyweightHandler extends AbstractFieldsToNodeFlyweightHandler {

    public FinalNodeFlyweightHandler(){}

    public FinalNodeFlyweightHandler(GetMethodNameAble getMethodNameAble,SetMethodNameAble setMethodNameAble){
        super(getMethodNameAble,setMethodNameAble);
    }
    @Override
    public ObjectTransformNode deal(Field nowField, ObjectTransformNode parrentTransfromNode,Class thisClass) {
        if (TypeJudgeUtil.isStringOrBasicType(nowField.getType())){
            ObjectTransNodeBuilder o = new ObjectTransNodeBuilder(ObjectTransNodeBuilder.TransNodeType.FINAL);
            commonDeal(o,nowField,parrentTransfromNode);
            o.setPolicyWay(parrentTransfromNode.getPojoWay() + "|" + nowField.getName()).
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
