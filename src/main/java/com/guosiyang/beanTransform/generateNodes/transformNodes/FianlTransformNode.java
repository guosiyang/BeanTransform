package com.guosiyang.beanTransform.generateNodes.transformNodes;

import java.util.HashSet;

/**
 * @ClassName : FianlTransformNode
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-24 20:59
 * @Think: 对于最终节点 我们不应该有访问子节点的方法
 *          因为它本身就是最终节点
 */
public class FianlTransformNode extends ObjectTransformNode {

    @Override
    public void addSonNodes(ObjectTransformNode sonNodes) {
        return;
    }

    @Override
    public HashSet<ObjectTransformNode> getSonNodes() {
        return null;
    }
}
