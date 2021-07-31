package com.lxd.pattern.build;

import lombok.Data;
import lombok.ToString;

/**
 * @Author lxd
 * @Date 2021/7/31 21:38
 **/
@Data
public class Humen {
    private String name;
    private int age;
    private String address;

    @Override
    public String toString() {
        return "Humen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
