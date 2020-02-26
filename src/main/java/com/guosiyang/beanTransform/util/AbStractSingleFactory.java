
package com.guosiyang.beanTransform.util;

import com.guosiyang.beanTransform.generateNodes.transformNodes.RootTransformNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName : AbStractSingleFactory
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-24 23:53
 * @Think:设计该类思路 像我目前写的东西 经常碰到策略仅仅注重的处理过程 并不需要关注对象本身
 * 故其实策略应该是单例的 但我们不能把每个策略都写成单例 因为策略本身仅仅关注处理过程
 * 故我们应该针对同一种类型策略设计一个单例工厂 对于此策略我们仅仅通过单例工厂的代理类来进行访问
 */
public abstract class AbStractSingleFactory<T> {

    protected final static Logger logger = LoggerFactory.getLogger(AbStractSingleFactory.class);

    //存放所需要的准备数据
    protected ConcurrentHashMap<String, T> stringToT = new ConcurrentHashMap<>();

    protected static AbStractSingleFactory singleFactory = null;

    protected AbStractSingleFactory() {
    }

    /**
     * @return
     * @Param
     * @description 该类 我的主要用途为数据初始化 把所需要的数据绑定在单例创建对象里 并调用
     * @author 郭思洋
     * @date 2020/2/25 0:21
     */
    protected abstract boolean init();

    /**
     * @return
     * @Param
     * @description 不支持覆盖 为什么呢 因为我所理解 能使用这个类的
     * 其实不用担心存储数量太大 或者需要更新 你啥策略里能存10个
     * 往多了说 20个顶天了 没必要覆盖 同时对于lambda表达式生成的策略不允许添加
     * @author 郭思洋
     * @date 2020/2/25 0:19
     */
    public boolean insertT(String type, T t) {
        if (type == null || "".equals(type) || t == null) {
            logger.info("传入的type或t为空");
            return false;
        }
        if (stringToT.containsKey(type)) {
            logger.info("传入的type : " + type + "已存在");
            return false;
        }
        if (LambdaUtil.isLambdaClass(type)){
            return false;
        }
        stringToT.put(type, t);
        return true;
    }

    /**
     * @return
     * @Param
     * @description 获取对应的T的类型
     * @author 郭思洋
     * @date 2020/2/25 0:26
     */
    public T getTByType(String type) {
        if (type == null || "".equals(type)) {
            return null;
        }
        return stringToT.get(type);
    }

    /**
     * @return
     * @Param
     * @description 看是否存在相关联的type 如果存在此type则不能使用
     * @author 郭思洋
     * @date 2020/2/25 0:30
     */
    public boolean isExistType(String type) {
        if (type == null || "".equals(type)) {
            logger.info("传入的type或t为空");
            return false;
        }
        return stringToT.containsKey(type);
    }
}
