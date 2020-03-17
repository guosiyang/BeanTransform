package com.guosiyang.beanTransform.util;

import com.google.common.base.Objects;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName : TwoContainer
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-17 01:39
 * @Think: 作为容器类 里面承载着2个对象
 */
public class TwoContainer<K,T> {

    //
    @Getter
    @Setter
    private K k;

    @Setter
    @Getter
    private T t;

    /**
    * @Param
    * @description TODO
    * @author 郭思洋
    * @date 2020/3/17 1:42
    * @return 作为通用的承载2个泛型的容器 我们必须在初始化的时候才进行赋值
    */
    public TwoContainer(K k,T t){
        this.k = k;
        this.t = t;
    }

    /**
    * @Param
    * @description TODO
    * @author 郭思洋
    * @date 2020/3/17 1:43
    * @return 没啥好说的 既然作为容器类 我们必须保证
     * 如果存入的两个对象相同 我们就应该认为同一对象 hashCode亦是如此的
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwoContainer<?, ?> that = (TwoContainer<?, ?>) o;
        return Objects.equal(k, that.k) &&
                Objects.equal(t, that.t);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(k, t);
    }
}
