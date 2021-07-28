package cn.liuyanhong.factory;

import cn.liuyanhong.service.Sall;


/**
 * 目标类
 * @Override 实现了接口的功能
 */
public class Gasoline implements Sall {
    @Override
    /**
     * 对接口中的功能进行实现
     */
    public float sall(int num) {
        return 11.0f * num;
    }
}
