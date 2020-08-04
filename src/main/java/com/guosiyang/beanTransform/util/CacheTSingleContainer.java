
package com.guosiyang.beanTransform.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName : AbStractSingleFactory
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-24 23:53
 * @Think:设计该类思路 为缓存T类型的容器
 * 注意!!!!!!!!!!!!!!实现此类必须是单例模式 因为只有单例才会对map进行缓存进去
 * 如果不是单例请不要继承此类 谢谢合作 切此实现类的不建议出现泛型往上传递的现象 浪费
 */
public abstract class CacheTSingleContainer<V> extends CacheVByKSingleContainer<String, V> {

    protected CacheTSingleContainer() {
    }

    public boolean insertT(String key, V value) {
        if (LambdaUtil.isLambdaClassBySimpleName(key)) {
            return false;
        }
        return super.insertT(key, value);
    }
}