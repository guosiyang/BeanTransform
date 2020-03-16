package com.guosiyang.beanTransform.util;

/**
 * @ClassName : ExpectedException
 * @Description : TODO
 * @Author : 郭思洋
 * @Date: 2020-03-15 00:39
 * @Think: 业务逻辑异常 : 目前没细分 先仅仅表示这个项目功能里面
 * 其中此类应该配合着枚举使用 调用此异常不仅仅需要传入异常信息 因为业务逻辑异常存在着情况
 * 在枚举里面写入此异常的发生类型 方便查找问题(我项目小 就是小功能 我就懒了不这么写了 理解一下 谢谢)
 */
public class ExpectedException extends RuntimeException {
    private static final long serialVersionUID = 4061732202885069884L;
    /**
     * 错误码
     */
    private int code;
    /**
     * 错误描述
     */
    private String msg;

    public ExpectedException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public ExpectedException(String msg) {
        super(msg);
        //通用错误码，可以使用常量或枚举
        this.code = 500;
        this.msg = msg;
    }

    /**
     * 重写堆栈填充，不填充错误堆栈信息，提高性能
     */
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
