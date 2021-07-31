package com.lxd.pattern.build;

import org.junit.jupiter.api.Test;

/**
 * @Author lxd
 * @Date 2021/7/31 21:48
 **/
public class BuildTest {
    @Test
    public void test(){
        BuildHumenImpl buildHumen = new BuildHumenImpl();
        BuildHumen buildHumen1 = buildHumen.buildAge().buildName().buildAddress();
        Humen humen = buildHumen1.builfHumrn();
        System.out.println(humen.toString());
    }
}
