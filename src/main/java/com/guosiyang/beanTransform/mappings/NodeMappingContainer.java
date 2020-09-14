package com.guosiyang.beanTransform.mappings;

import com.guosiyang.beanTransform.mappings.entitys.NewToOldMappingReation;
import com.guosiyang.beanTransform.mappings.entitys.POJOToPOJOMapping;
import com.guosiyang.beanTransform.util.CacheVByKSingleContainer;

import java.util.List;

/**
 * @ClassName : NodeMappingContainer
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-22 02:30
 * @Think: 本类 为POJOToPOJOMapping, List<NewToOldMappingReation>的容器类
 */
public class NodeMappingContainer extends CacheVByKSingleContainer<POJOToPOJOMapping, List<NewToOldMappingReation>> {
    @Override
    protected boolean init() {
        return true;
    }

    private NodeMappingContainer(){}

    /**
    * @Param
    * @description TODO
    * @author 郭思洋
    * @date 2020/3/22 2:38
    * @return 没啥好说的单例模式
    */
    public static CacheVByKSingleContainer<POJOToPOJOMapping, List<NewToOldMappingReation>> getInstance(){
        if (singleFactory == null){
            synchronized (NodeMappingContainer.class){
                if (singleFactory == null){
                    singleFactory = new NodeMappingContainer();
                }
            }
        }
        return (CacheVByKSingleContainer<POJOToPOJOMapping, List<NewToOldMappingReation>>) singleFactory;
    }
}
