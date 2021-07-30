package com.lxd.pattern;

/**
 * @Author lxd
 * @Date 2021/7/29 22:53
 **/
public class Sington {
    private static volatile Sington sington;

    private Sington(){

    }

    public static Sington getInstance(){
        if(sington == null){
            synchronized (Sington.class){
                if (sington == null){
                    sington = new Sington();
                }
            }
        }
        return sington;
    }
}
