package cn.liuyanhong;

import cn.liuyanhong.factory.Gasoline;
import cn.liuyanhong.handler.SaleGasoline;
import cn.liuyanhong.service.Sall;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @gl.getClass().getClassLoader() 目标类类加载器
 * @gl.getClass().getInterfaces() 目标类实现的接口类
 * @sgl 代理类对象
 * @o 通过Proxy.newProxyInstance()方法就可以创建一个动态代理对象
 */
public class MainSale {
    public static void main(String[] args) {
        //创建目标类对象
        Gasoline gl = new Gasoline();
        //创建代理类对象
        InvocationHandler sgl = new SaleGasoline(gl);
        //返回动态代理对象
        Sall o = (Sall) Proxy.newProxyInstance(gl.getClass().getClassLoader(),
                gl.getClass().getInterfaces(),
                sgl);
        float sall = o.sall(0);
        System.out.println(sall);
    }
}
