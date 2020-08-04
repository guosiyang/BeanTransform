package com.guosiyang.beanTransform.mappings;

import com.google.common.collect.Lists;
import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;
import com.guosiyang.beanTransform.generateNodes.transformNodes.RootTransformNode;
import com.guosiyang.beanTransform.mappings.entitys.InNodeMappingReation;
import com.guosiyang.beanTransform.mappings.entitys.NewToOldMappingReation;
import com.guosiyang.beanTransform.mappings.entitys.POJOToPOJOMapping;
import com.guosiyang.beanTransform.util.CacheVByKSingleContainer;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

/**
 * @ClassName : NodesMappingOperator
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-21 02:22
 * @Think: 我呀 最最开始的时候想设计
 */
public class NodesMappingOperator {

    //单例容器 访问
    private static final CacheVByKSingleContainer<POJOToPOJOMapping, List<NewToOldMappingReation>> singleContainer = NodeMappingContainer.getInstance();

    /**
     * @return
     * @Param
     * @description 对外暴露出将进行解析成new To old 映射关系的方法
     * @author 郭思洋
     * @date 2020/3/23 1:09
     */
    public Map<String, List<NewToOldMappingReation>> getNewToOld(Map<String, List<ObjectTransformNode>> oldNodes,
                                                                 Map<String, List<ObjectTransformNode>> newNodes,
                                                                 String[] oldToNewMappings) {
        Map<String, List<NewToOldMappingReation>> stringToMappingList = new ConcurrentHashMap<>();
        HashSet<InNodeMappingReation> inNodeMappingReations = new HashSet<>();
        ArrayList<String> inOldToNewMappingList = Lists.newArrayList(Arrays.asList(oldToNewMappings));
        inOldToNewMappingList.stream().forEach(mapping -> {
            inNodeMappingReations.add(InNodeMappingReation.genInMapping(mapping));
        });
        Stream<InNodeMappingReation> reationStream = inNodeMappingReations.stream();
        if (oldNodes.size() == 1) {
            Set<String> oldStrings = oldNodes.keySet();
            Set<String> newstrings = newNodes.keySet();
            newstrings.stream().forEach(newstring -> {
                String oldPliocyWay = (String) oldStrings.toArray()[0];
                InNodeMappingReation[] nodeMappingReations = (InNodeMappingReation[]) reationStream.filter(reation -> {
                    return reation.getOldPolicyWay() == oldPliocyWay && reation.getNewPolicyWay() == newstring;
                }).toArray();
                POJOToPOJOMapping p = getNodeMapping(oldNodes.get(oldPliocyWay), newNodes.get(newstring),
                        new HashSet<InNodeMappingReation>(Arrays.asList(nodeMappingReations)));
                if (singleContainer.isExistType(p)){
                    stringToMappingList.put(oldPliocyWay+"_"+newstring,singleContainer.getTByType(p));
                }else{
                    //还没写如何生成映射
                }
            });
        }
        return stringToMappingList;
    }

    /**
     * @return
     * @Param
     * @description 该类的主要作用是生成单例容器里面的键
     * 为啥使用hashset而不使用arryList 道理很简单 hashset不关注对象的存入顺序
     * 而 判断两个arrylist对象是否一致时如果容器内对象一致但传入的顺序不一致也是不相等的 所有使用hashset
     * @author 郭思洋
     * @date 2020/3/23 0:58
     */
    private POJOToPOJOMapping getNodeMapping(List<ObjectTransformNode> oldNodes, List<ObjectTransformNode> newNodes, HashSet<InNodeMappingReation> inNodeReationList) {
        RootTransformNode oldRootNode = getRootNodeByNodeList(oldNodes);
        RootTransformNode newRootNode = getRootNodeByNodeList(newNodes);
        POJOToPOJOMapping p = new POJOToPOJOMapping();
        p.setNewRootTransformNode(newRootNode);
        p.setOldRootTransformNode(oldRootNode);
        p.setInNodeMappingReations(inNodeReationList);
        return p;
    }

    /**
     * @return 该方法主要是传入nodelist找出里面的rootNode节点
     * @Param
     * @description TODO
     * @author 郭思洋
     * @date 2020/3/22 13:27
     */
    private RootTransformNode getRootNodeByNodeList(List<ObjectTransformNode> nodeList) {
        Object[] objects = nodeList.stream().filter(node -> {
            if (node instanceof RootTransformNode)
                return true;
            return false;
        }).toArray();
        return (RootTransformNode) objects[0];
    }
}
