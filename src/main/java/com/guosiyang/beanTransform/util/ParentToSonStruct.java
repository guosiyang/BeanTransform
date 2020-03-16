package com.guosiyang.beanTransform.util;

import lombok.Getter;
import lombok.NonNull;

import java.util.HashSet;

/**
 * @ClassName : AbstarctFileStruct
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-14 21:00
 * @Think: 该类 是我在此项目中碰到的 我们生成的结构树里面 需要存放当前节点 a
 * 当前节点的a的父类节点 a节点的子节点 在我此功能里面经常碰到 切在我的下一个功能里面也会经常使用
 *
 */
public class ParentToSonStruct {
    //存放当前节点的父节点
    @Getter
    private ParentToSonStruct parentNode;

    //存放当前节点的子节点
    @Getter
    private HashSet<ParentToSonStruct> sonNodes = new HashSet<>();

    public void setParentNode(@NonNull ParentToSonStruct parentNode) {
        this.setParentNode(parentNode);
        if (!parentNode.getSonNodes().contains(this)) {
            parentNode.addSonNodes(this);
        }
    }

    public HashSet<ParentToSonStruct> getSonNodes() {
        return sonNodes;
    }

    public void addSonNodes(@NonNull ParentToSonStruct sonNodes) {
        this.sonNodes.add(sonNodes);
        sonNodes.setParentNode(this);
    }
}
