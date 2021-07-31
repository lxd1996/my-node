package com.lxd.pattern.factory;

/**
 * @Author lxd
 * @Date 2021/7/31 16:50
 **/
public class BlackHumen implements Humen{
    @Override
    public void getColor() {
        System.out.println("我是黑种人");
    }
}
