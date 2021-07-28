package cn.liuyanhong.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * 对目标类中的功能进行增强
 * 需要实现InvocationHandler（调用处理器）接口
 */
public class SaleGasoline implements InvocationHandler {
    private Object pinpai = null;

    public SaleGasoline(Object pinpai) {
        this.pinpai = pinpai;
    }

    /**
     *
     * @param proxy JDK创建的代理对象
     * @param method 目标类中的方法
     * @param args 目标方法的参数
     * @return 返回增强处理结果返给动态代理对象调用位置
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = method.invoke(pinpai, args);
        if (args != null){
            float price = (float) res;
            res = price * 1.5f;
        }

        return res;
    }
}
