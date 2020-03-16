package com.guosiyang.beanTransform.generateNodes;

import com.guosiyang.beanTransform.generateNodes.objectToFields.ChoiceFieldsAble;
import com.guosiyang.beanTransform.generateNodes.objectToFields.ClassToFieldsOperator;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @ClassName : GenerateNodesOperator
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-16 00:09
 * @Think: 将一个POJO对象转换成一个NodeList
 */
public class GenerateNodesOperator {

    public ArrayList<ObjectTransformNode> getNodeList() {
        return nodeList;
    }

    public void deal(Class c, ChoiceFieldsAble choiceFieldsAble){
        ClassToFieldsOperator classToFieldsOperator = new ClassToFieldsOperator(choiceFieldsAble);
        ArrayList<Field> arrayList = classToFieldsOperator.classToFields(c);

    }


    public void setNodeList(ArrayList<ObjectTransformNode> nodeList) {
        this.nodeList = nodeList;
    }

    ArrayList<ObjectTransformNode> nodeList = new ArrayList<>();


}
