package com.guosiyang.beanTransform.generateNodes;

import com.google.common.collect.Lists;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.AbstractFieldsToNodeFlyweightHandler;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.NodeFlyweightHandlerFactory;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.CommonGetMethodName;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.CommonSetMethodName;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.GetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.SetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.objectToFields.ChoiceFieldsAble;
import com.guosiyang.beanTransform.generateNodes.objectToFields.ClassToFieldsOperator;
import com.guosiyang.beanTransform.generateNodes.transformNodes.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName : GenerateNodesOperator
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-16 00:09
 * @Think: 将一个POJO对象转换成一个NodeList
 */
public class GenerateNodesOperator {

    private final static Logger logger = LoggerFactory.getLogger(GenerateNodesOperator.class);


    ArrayList<ObjectTransformNode> nodeList = new ArrayList<>();

    public ArrayList<ObjectTransformNode> getNodeList() {
        return nodeList;
    }

    /**
     * @return 对于没有传入的设置get/setMethodName则走使用通用处理
     * @Param
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/17 0:46
     */
    public void deal(Class c, ChoiceFieldsAble choiceFieldsAble) {
        deal(c, choiceFieldsAble, new CommonSetMethodName(), new CommonGetMethodName());
    }

    /**
     * @return
     * @Param
     * @description 参数详解 c为外部传入被解析的class ChoiceFieldsAble为外部筛选field对象
     * setMethodName/getMethodName是拿到对应的方法名称 默认是get/set 对于collection类型 则是add+泛型的类型的简单类名/get
     * @author 郭思洋
     * @date 2020/3/18 1:02
     */
    public void deal(Class c, ChoiceFieldsAble choiceFieldsAble, SetMethodNameAble setMethod, GetMethodNameAble getMethod) {
        NodeFlyweightHandlerFactory nodeDealFactory = NodeFlyweightHandlerFactory.getInstance();
        AbstractFieldsToNodeFlyweightHandler nodeFlyweightHandler = nodeDealFactory.getFianlHandler(getMethod, setMethod);
        ObjectTransformNode rootNode = nodeFlyweightHandler.deal(null, null, c);
        nodeList.add(rootNode);
        ClassToFieldsOperator classToFieldsOperator = new ClassToFieldsOperator(choiceFieldsAble);
        ArrayList<Field> arrayList = classToFieldsOperator.classToFields(c);
        getTransNodes(classToFieldsOperator, c, rootNode, nodeFlyweightHandler);
        nodeList.stream().forEach(node -> node.setPojoWay(c.getName()));
    }

    /**
     * @return
     * @Param
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/18 1:02
     */
    private void getTransNodes(ClassToFieldsOperator fieldsOperator, Class c, ObjectTransformNode parent, AbstractFieldsToNodeFlyweightHandler nodeHandler) {
        ArrayList<Field> arrayList = fieldsOperator.classToFields(c);
        Map<String, List<ObjectTransformNode>> nodeMap = arrayList.stream().parallel().map(field -> nodeHandler.
                deal(field, parent, field.getType())).collect(Collectors.groupingBy(node -> {
            nodeList.add(node);
            logger.info("创建节点成功 : 节点对象为" + node);
            return node.getClass().getSimpleName();
        }));
        List<ObjectTransformNode> listnodeAndCommonNodeList = Lists.newArrayList(nodeMap.get("ListTransformNode"));
        listnodeAndCommonNodeList.addAll(nodeMap.get("CommonTransformNode"));
        listnodeAndCommonNodeList.stream().forEach(node -> getTransNodes(fieldsOperator, node.getNowField().getType(), node, nodeHandler));
    }

    public void setNodeList(ArrayList<ObjectTransformNode> nodeList) {
        this.nodeList = nodeList;
    }

}
