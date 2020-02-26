package com.guosiyang.beanTransform.generateNodes.transformNodes;

import com.sun.xml.internal.ws.api.model.MEP;
import sun.reflect.generics.tree.VoidDescriptor;

import java.lang.reflect.Method;

/**
 * @ClassName : IsTransformNode
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-02-23 22:34
 * @Think: 该接口 主要表示 为所有实现该接口的方法的类 都是转换节点类 为实现 映射进行做准备
 * 比如 在数据库对象中 就有 数据库对象本身的(作为根节点) 每个属性 作为子节点
 *  无论是什么节点 都得有访问或者获取解析完成的方法
 * 在报文/bean中 同理 () 起初我想设计成一个类 完事 用标记代表不同的类型
 * 后来觉得 如果当时考虑不周的话我们所做的就是要修改原来代码
 * 我们应该保持对扩展开放 对修改关闭的思想
 */
public interface IsTransformNode {

    /**
    * @Param
    * @description 提供 得到访问方法
    * @author 郭思洋
    * @date 2020/2/23 22:44
    * @return
    */
    public Method getSetMethod();

    /**
     * @Param
     * @description 设置 得到访问方法
     * @author 郭思洋
     * @date 2020/2/23 22:44
     * @return
     */
    public void setSetMethod(Method method);

    /**
     * @Param
     * @description 得到 得到访问方法
     * @author 郭思洋
     * @date 2020/2/23 22:44
     * @return
     */
    public Method getGetMethod();

    /**
     * @Param
     * @description 设置 得到访问方法
     * @author 郭思洋
     * @date 2020/2/23 22:44
     * @return
     */
    public void setGetMethod(Method method);

    /**
     * @Param
     * @description 每一个节点对象都应该有一个得到唯一标识符的方法 说白了怎么证明 该节点是唯一节点
     * @author 郭思洋
     * @date 2020/2/23 22:44
     * @return
     */
    public String getOnlySign();

}
