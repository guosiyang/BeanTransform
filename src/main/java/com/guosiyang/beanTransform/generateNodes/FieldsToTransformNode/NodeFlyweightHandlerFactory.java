package com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode;

import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.GetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.SetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.transformNodes.FianlTransformNode;
import com.guosiyang.beanTransform.generateNodes.transformNodes.RootTransformNode;
import com.guosiyang.beanTransform.util.LambdaUtil;
import com.guosiyang.beanTransform.util.TwoContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.plugin2.message.LaunchJVMAppletMessage;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName : NodeFlyweightHandlerFactory
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-17 01:52
 * @Think: 享元模式对外暴露的享元工厂 如有疑问请 去查看设计模式中的享元模式
 * 写成单例工厂就行简单
 */
public class NodeFlyweightHandlerFactory {

    private final static Logger logger = LoggerFactory.getLogger(NodeFlyweightHandlerFactory.class);

    private static volatile NodeFlyweightHandlerFactory singleFactory = null;

    private final ConcurrentHashMap<TwoContainer<GetMethodNameAble, SetMethodNameAble>, FinalNodeFlyweightHandler> methodToHandler = new ConcurrentHashMap<>();

    private NodeFlyweightHandlerFactory() {
    }

    /**
     * @return 设计思路 我为什么把fianlHander 作为责任链中的第一环
     * 因为按照我对报文的理解概念 节点出现频率应该是Final>Object>List>Root
     * 故我们的按照和这个出现频率设计相关的责任顺序 节省cpu资源
     * <p>
     * 校验逻辑 我认为 你都lambda表达式了 我觉得您仅仅关注的生成结果 并不关注如何去复用此责任链
     * 故我认为对于lambda表达式生成的接口 默认不走缓存
     * 注意 注意!!!!!!!!!!! 如果你想走缓存请使用正常的实现类 不允许使用方法引用跟lambda表达式
     * @Param
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/17 2:05
     */
    public FinalNodeFlyweightHandler getFianlHandler(GetMethodNameAble getMethodNameAble, SetMethodNameAble setMethodNameAble) {
        TwoContainer<GetMethodNameAble, SetMethodNameAble> setAndGetName = new TwoContainer<>(getMethodNameAble, setMethodNameAble);
        FinalNodeFlyweightHandler finalHandler = null;
        if (LambdaUtil.isLambdaClassByObj(getMethodNameAble) || LambdaUtil.isLambdaClassByObj(setMethodNameAble) ||
                !methodToHandler.containsKey(setAndGetName)) {
            finalHandler = new FinalNodeFlyweightHandler(getMethodNameAble, setMethodNameAble);
            ObjectNodeFlyweightHandler objectHandler = new ObjectNodeFlyweightHandler(getMethodNameAble, setMethodNameAble);
            ListNodeFlyweightHandler listHandler = new ListNodeFlyweightHandler(getMethodNameAble, setMethodNameAble);
            RootNodeFlyweightHandler rootHandler = new RootNodeFlyweightHandler(getMethodNameAble, setMethodNameAble);
            finalHandler.setNextHandler(objectHandler);
            objectHandler.setNextHandler(listHandler);
            listHandler.setNextHandler(rootHandler);
            //如果不是进行缓存数据
            if (!LambdaUtil.isLambdaClassByObj(getMethodNameAble) && !LambdaUtil.isLambdaClassByObj(setMethodNameAble)) {
                methodToHandler.put(setAndGetName, finalHandler);
            }
        } else if (finalHandler == null) {
            finalHandler = methodToHandler.get(setAndGetName);
        }
        return finalHandler;
    }

    public static NodeFlyweightHandlerFactory getInstance() {
        if (singleFactory == null) {
            synchronized (NodeFlyweightHandlerFactory.class) {
                if (singleFactory == null) {
                    singleFactory = new NodeFlyweightHandlerFactory();
                }
            }
        }
        return singleFactory;
    }
}
