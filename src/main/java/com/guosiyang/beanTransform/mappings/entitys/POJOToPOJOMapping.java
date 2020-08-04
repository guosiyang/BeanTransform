package com.guosiyang.beanTransform.mappings.entitys;

import com.google.common.base.Objects;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;
import com.guosiyang.beanTransform.generateNodes.transformNodes.RootTransformNode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

/**
 * @ClassName : POJOToPOJOMapping
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-21 23:48
 * @Think: 无论你是一转多 还是多转一 还是一转一 只要你输入的节点的policyWay一致
 * 并且有可能(不是一定会传入的特殊映射关系) 这三个条件一致
 * 则生成的oldNode - newNode的关系也必然是一致的 所有可以走缓存 此对象就是描述单一关系的
 * 比如 (A,B) -> C  List<InNodeMappingReation> s
 * 则会生成2个该对象 其中一个是A  C  满足A,C条件的 s
 * 另外一个是 B C 满足条件的 s(s描述的映射关系必须得是 BC相关)
 * 此类只要 这三个对象一致 则认为是一致的
 */

public class POJOToPOJOMapping {
    @Setter
    @Getter
    RootTransformNode oldRootTransformNode;
    @Setter
    @Getter
    RootTransformNode newRootTransformNode;
    @Setter
    @Getter
    Set<InNodeMappingReation> inNodeMappingReations;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        POJOToPOJOMapping that = (POJOToPOJOMapping) o;
        return Objects.equal(newRootTransformNode, that.newRootTransformNode) &&
                Objects.equal(newRootTransformNode, that.newRootTransformNode) &&
                Objects.equal(inNodeMappingReations, that.inNodeMappingReations);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(newRootTransformNode, newRootTransformNode, inNodeMappingReations);
    }
}
