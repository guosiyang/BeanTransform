package com.guosiyang.beanTransform.mappings.entitys;

import com.guosiyang.beanTransform.generateNodes.transformNodes.ObjectTransformNode;
import com.guosiyang.beanTransform.util.ParentToSonStruct;
import lombok.Data;
import lombok.Getter;

/**
 * @ClassName : MappingNode
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-20 22:03
 * @Think: 这是一种描述映射关系 oldNode - newNode 才能通过反射调用
 * 这个类是最后生成的结果 往调用里面传
 */
@Data
public class NewToOldMappingReation extends ParentToSonStruct {
    private ObjectTransformNode oldNode;
    private ObjectTransformNode newNode;
}
