package com.guosiyang.beanTransform.generateNodes;

import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;
import com.guosiyang.beanTransform.util.CacheTSingleContainer;

import java.util.List;

/**
 * @ClassName : TransformNodesContrainer
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-18 02:04
 * @Think: 对于所以解析过后的transformNodes按照root节点的类全限定名称进行划分 单例模式
 *
 */
public class NodesContainerSingleContainer extends CacheTSingleContainer<List<ObjectTransformNode>> {

    private NodesContainerSingleContainer(){}

    public static CacheTSingleContainer<List<ObjectTransformNode>> getInstance() {
        if (singleFactory == null) {
            synchronized (NodesContainerSingleContainer.class) {
                singleFactory = new NodesContainerSingleContainer();
                ((NodesContainerSingleContainer) singleFactory).init();
            }
        }
        return singleFactory;
    }

    @Override
    protected boolean init() {
        return false;
    }
}
