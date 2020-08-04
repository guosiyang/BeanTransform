package com.guosiyang.beanTransform.mappings.entitys;

import com.google.common.base.Splitter;
import com.guosiyang.beanTransform.generateNodes.GenerateNodesOperator;
import lombok.Data;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @ClassName : InNodeMappingReation
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-21 02:43
 * @Think: 该类为传入的list<String>的单挑解析过后的映射节点实体类对象
 * 并提供static方法校验是否为映射类型
 * 举例子 : com.guosiyang.old.Policy|BaseInfo|TellPhone-com.guosiyang.new.Policy|BaseInfo|Phone
 * 意义 把old包下的policy对象的TellPhone的值 映射到 new包下的Phone值
 * 注意!!!!!!!!!!!! 第一 : -前后不能加空格 包括最末尾
 * 第二 : BaseInfo,等属性必须秒为大写(因为这个是)
 * 第三 :此类仅仅是根据传入的定制string进行拆分 并没有相关逻辑性校验(比如是否存在这个节点 比如policyWay是否在输入内等等) 逻辑性校验在后面
 */
@Data
public class InNodeMappingReation {

    private final static Logger logger = LoggerFactory.getLogger(InNodeMappingReation.class);

    Integer type;

    //传入的老的根节点路径
    String oldPolicyWay;

    //传入新的根节点路径
    String newPolicyWay;

    //传入老的位置
    String[] oldPostions;

    //传入新的位置
    String[] newPostions;

    /**
    * @Param
    * @description TODO
    * @author 郭思洋
    * @date 2020/3/22 13:16
    * @return 该方法主要是进行对传入的单挑mapping解析 如果满足映射格式 则会被成功解析
    */
    public static InNodeMappingReation genInMapping(String mappingInfo) {
        //解析逻辑根据-进行拆分 出掉空的字符串 和去除掉前后空格
        List<String> strings = Splitter.on("-").omitEmptyStrings().trimResults().splitToList(mappingInfo);
        if (strings.size() != 2) {
            logger.info("传入的mappingInfo为" + mappingInfo + "解析过后节点数量不为2  , 请确认");
            return null;
        }
        Splitter splitter= Splitter.on("|").omitEmptyStrings().trimResults();
        List<String> oldNode = splitter.splitToList(strings.get(0));
        List<String> newNode = splitter.splitToList(strings.get(1));
        if (oldNode.size()<2 || newNode.size()<2){
            logger.info("传入的mappingInfo为" + mappingInfo + "新节点或者老节点数量不为2");
            return null;
        }
        InNodeMappingReation in = new InNodeMappingReation();
        in.setOldPolicyWay(oldNode.get(0));
        in.setOldPostions((String [])oldNode.subList(1,oldNode.size()).toArray());
        in.setNewPolicyWay(newNode.get(0));
        in.setNewPostions((String [])newNode.subList(1,newNode.size()).toArray());
        return in;
    }
}
