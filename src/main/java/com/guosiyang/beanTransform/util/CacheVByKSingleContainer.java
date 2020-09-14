package com.guosiyang.beanTransform.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName : CacheVByKSingleContainer
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-21 02:30
 * @Think:为缓存K,V类型的容器 * 注意!!!!!!!!!!!!!!实现此类必须是单例模式 因为只有单例才会对map进行缓存进去
 * * 如果不是单例请不要继承此类 谢谢合作 切此实现类的不建议出现泛型往上传递的现象 浪费
 */
public abstract class CacheVByKSingleContainer<K, V> {

    protected final static Logger logger = LoggerFactory.getLogger(CacheTSingleContainer.class);

    //存放所需要的准备数据
    protected ConcurrentHashMap<K, V> KToT = new ConcurrentHashMap<>();

    protected static CacheVByKSingleContainer singleFactory = null;

    protected CacheVByKSingleContainer() {
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
    public boolean insertT(K key, V value) {
        if (key == null || "".equals(key) || value == null) {
            logger.info("传入的type或t为空");
            return false;
        }
        if (KToT.containsKey(key)) {
            logger.info("传入的type : " + key + "已存在");
            return false;
        }
        KToT.put(key, value);
        logger.info("K为" + key + "缓存成功");
        return true;
    }

    /**
     * @return
     * @Param
     * @description 获取对应的T的类型
     * @author 郭思洋
     * @date 2020/2/25 0:26
     */
    public V getTByType(K key) {
        if (key == null || "".equals(key)) {
            return null;
        }
        return KToT.get(key);
    }

    /**
     * @return
     * @Param
     * @description 看是否存在相关联的type 如果存在此type则不能使用
     * @author 郭思洋
     * @date 2020/2/25 0:30
     */
    public boolean isExistType(K key) {
        if (key == null || "".equals(key)) {
            logger.info("传入的type或t为空");
            return false;
        }
        return KToT.containsKey(key);
    }
}
