package com.lxd.pattern.factory;

/**
 * @Author lxd
 * @Date 2021/7/31 16:49
 **/
public class WhriteHumen implements Humen{
    @Override
    public void getColor() {
        System.out.println("我是白种人");
    }
}
