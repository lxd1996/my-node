package com.lxd.pattern.build.build1;

/**
 * @Author lxd
 * @Date 2021/7/31 22:12
 **/
public class Test {
    public static void main(String[] args) {
        Computer build = new Computer.ComputerBuild("intel", "dongzh").buildKeybord("η½ζ").buildDisplay("δΈζ").buildUsbCounnt(2).build();
        System.out.println(build.toString());
    }
}
