package com.lxd.pattern.factory;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author lxd
 * @Date 2021/7/31 16:51
 **/
public class HumenFactory {
    public static Humen newInstance(String humen){
        if (StringUtils.isBlank(humen)) {
            return null;
        }else if(humen.equals("yello")){
            return new YelloHumen();
        }else if(humen.equals("black")){
            return new BlackHumen();
        }else if(humen.equals("white")){
            return new WhriteHumen();
        }else {
            return null;
        }
    }
}
