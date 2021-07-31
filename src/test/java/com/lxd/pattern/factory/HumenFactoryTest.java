package com.lxd.pattern.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author lxd
 * @Date 2021/7/31 20:41
 **/
public class HumenFactoryTest {
    @Test
    public void humenTest(){
        Humen yello = HumenFactory.newInstance("yello");
        Humen black = HumenFactory.newInstance("black");
        yello.getColor();
        black.getColor();


    }
}
