package com.lxd.pattern;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author lxd
 * @Date 2021/7/29 22:56
 **/
public class SingtonTest {

    @Test
    public void test(){
        Sington sington = Sington.getInstance();
        Sington sington1 = Sington.getInstance();
        assertEquals(sington,sington1);
    }
}
