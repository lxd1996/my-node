package com.lxd.pattern.build.build2;

import lombok.Data;

/**
 * @Author lxd
 * @Date 2021/7/31 22:21
 **/
@Data
public class Computer {
    private String cpu;//必须
    private String ram;//必须
    private int usbCount;//可选
    private String keyboard;//可选
    private String display;//可选

    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }
}
