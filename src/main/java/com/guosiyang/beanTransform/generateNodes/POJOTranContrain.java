package com.guosiyang.beanTransform.generateNodes;

import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.GetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.FieldsToTransformNode.methodName.SetMethodNameAble;
import com.guosiyang.beanTransform.generateNodes.objectToFields.ChoiceFieldsAble;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * @ClassName : POJOTranContrain
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-14 21:21
 * @Think: 该类存放的是解析一个类所需要的东西
 * 比如 传入一个被解析的对象
 */
public class POJOTranContrain {


    /*
        被解析的对象
    */
    @Getter
    @Setter
    private Object transObject;

    /*
        该属性比如 像通过工具生成的数据库对象总会有一些奇奇怪怪的属性 比如该对数据库对象内的字段数量等等
        这些属性不应该被生成节点  故需要派出掉
    */
    @Getter
    @Setter
    private ChoiceFieldsAble choiceFieldsAble;

    /*
    *   该对象必须为如果对于想要解析成的类型可以进行传入class 而不需要传入相关Object对象
    */
    @Getter
    @Setter
    private Class objectClass;

    /**
     * 怎么能确定一个字段对应的set方法 通过参数 / 方法名称拿到反射 就是此接口的参数
     */
    @Getter
    @Setter
    private SetMethodNameAble setMethodNameAble;

    /**
     * 怎么能确定一个字段的get方法 仅仅需要知道名称就行
     */
    @Getter
    @Setter
    private GetMethodNameAble getMethodNameAble;

    @Override
    public String toString() {
        return "POJOTranContrain{" +
                "transObject=" + transObject +
                ", objectClass=" + objectClass +
                '}';
    }
}

