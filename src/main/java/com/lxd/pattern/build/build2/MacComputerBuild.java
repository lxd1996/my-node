package com.lxd.pattern.build.build2;

import java.util.Locale;

/**
 * @Author lxd
 * @Date 2021/7/31 22:24
 **/
public class MacComputerBuild extends ComputerBuild{

    private Computer computer;

    public MacComputerBuild(String cpu,String arm){
        computer = new Computer(cpu,arm);
    }

    @Override
    public void BuildKeybord() {
        computer.setKeyboard("苹果键盘");
    }

    @Override
    public void BuildDisplay() {
        computer.setDisplay("苹果显示器");
    }

    @Override
    public void BuildUsbCount() {
        computer.setUsbCount(3);
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
