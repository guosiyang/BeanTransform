package com.guosiyang.beanTransform.generateNodes.transformNodes;

import com.guosiyang.beanTransform.util.ParentToSonStruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.Optional;

/**
 * @ClassName : RootTransformNode
 * @Description :
 * @Author : 郭思洋
 * @Date: 2020-02-23 23:38
 * @Think:根节点 为最大的节点 例如 一个报文对象 这个报文对象就是根节点
 * 此根节点不应该有get跟set方法 因为他就是最大的
 */
public class RootTransformNode extends ObjectTransformNode {

    private final static Logger logger = LoggerFactory.getLogger(RootTransformNode.class);

    @Override
    public Method getSetMethod() {
        return null;
    }

    @Override
    public void setSetMethod(Method method) {
        return;
    }

    @Override
    public Method getGetMethod() {
        return null;
    }

    @Override
    public void setGetMethod(Method method) {
        return;
    }

    @Override
    public void setParentNode(ParentToSonStruct parentNode) {
        return;
    }

    @Override
    public ParentToSonStruct getParentNode() {
        return null;
    }
}
