package com.guosiyang.beanTransform;

import com.guosiyang.beanTransform.generateNodes.POJOTranContrain;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : TransformOperator
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-18 02:30
 * @Think: 对外暴露的util直接访问该类 进行操作
 */
 class TransformOperator {

     /**
     * @Param
     * @description 主要是对util暴露调用 操作步骤如下 :
      * 1 . 将所有报文 解析成transformNode 2 . 根据给定条件 梳理出映射关系 生成映射关系树 3 . 根据映射关系树 进行调用反射 生成对象组
     * @author 郭思洋
     * @date 2020/3/18 2:33
     * @return
     */
     Object[] pojosTopojos(List<POJOTranContrain> inList, List<POJOTranContrain> outList){
         return null;
     }

}
