package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode;

import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.GetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.SetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransNodeBuilder;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;

import java.lang.reflect.Field;

/**
 * @ClassName : RootNodeHandler
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-26 22:27
 * @Think: 根节点对应的生成RootTransformNode对象
 * 判断逻辑 如果当前节点没有传入父类节点则认为其是 root节点(父节点)
 */
public class RootNodeFlyweightHandler extends AbstractFieldsToNodeFlyweightHandler {

    public RootNodeFlyweightHandler(GetMethodNameAble getMethodNameAble, SetMethodNameAble setMethodNameAble){
        super(getMethodNameAble,setMethodNameAble);
    }
    public RootNodeFlyweightHandler(){}

    @Override
    public ObjectTransformNode deal(Field nowField, ObjectTransformNode parrentTransfromNode,Class thisClass) {
        if (parrentTransfromNode == null){
            ObjectTransNodeBuilder o =new ObjectTransNodeBuilder(ObjectTransNodeBuilder.TransNodeType.ROOT);
            try {
                o.setConstructor(thisClass.getConstructor(null));
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            return o.setPolicyWay(thisClass.getSimpleName()).getResult();
        }
        if (nextHandler == null){
            return null;
        }
        return nextHandler.deal(nowField,parrentTransfromNode,thisClass);
    }
}
