package com.guosiyang.beanTransform;

import com.guosiyang.beanTransform.generateNodes.GenerateNodesOperator;
import com.guosiyang.beanTransform.generateNodes.POJOTranContrain;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName : TransformOperator
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-18 02:30
 * @Think: 对外暴露的util直接访问该类 进行操作
 */
class TransformOperator {

    /**
     * @return
     * @Param
     * @description 主要是对util暴露调用 操作步骤如下 :
     * 1 . 将所有报文 解析成transformNode 2 . 根据给定条件 梳理出映射关系 生成映射关系树 3 . 根据映射关系树 进行调用反射 生成对象组
     * @author 郭思洋
     * @date 2020/3/18 2:33
     */
    Object[] pojosTopojos(List<POJOTranContrain> inList, List<POJOTranContrain> outList,List<String> oldToNewMappings) {
        Map<String, List<ObjectTransformNode>> inPolicyWayToNodes = new HashMap<>();
        Map<String, List<ObjectTransformNode>> outPolicyWayToNodes = new HashMap<>();
        inList.stream().forEach(in -> {
            Class c = null;
            c = in.getObjectClass() == null ? in.getTransObject().getClass() : in.getObjectClass();
            List<ObjectTransformNode> nodes = new GenerateNodesOperator().
                    deal(c, in.getChoiceFieldsAble(), in.getSetMethodNameAble(), in.getGetMethodNameAble());
            inPolicyWayToNodes.put(nodes.get(0).getPojoWay(), nodes);
        });
        outList.stream().forEach(in -> {
            Class c = null;
            c = in.getObjectClass() == null ? in.getTransObject().getClass() : in.getObjectClass();
            List<ObjectTransformNode> nodes = new GenerateNodesOperator().
                    deal(c, in.getChoiceFieldsAble(), in.getSetMethodNameAble(), in.getGetMethodNameAble());
            outPolicyWayToNodes.put(nodes.get(0).getPojoWay(), nodes);
        });
        return null;
    }

}
