package com.lxd.pattern.build.build2;

/**
 * @Author lxd
 * @Date 2021/7/31 22:27
 **/
public class LenvooComputerBuilld extends ComputerBuild{

    Computer computer;
    public LenvooComputerBuilld(String cpu, String arm){
        computer = new Computer(cpu,arm);
    }

    @Override
    public void BuildKeybord() {
        this.computer.setKeyboard("联想键盘");
    }

    @Override
    public void BuildDisplay() {
        this.computer.setDisplay("联想显示器");
    }

    @Override
    public void BuildUsbCount() {
        this.computer.setUsbCount(2);
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
