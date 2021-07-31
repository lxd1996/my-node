package com.lxd.pattern.build.build2;

/**
 * @Author lxd
 * @Date 2021/7/31 22:30
 **/
public class ComputerDirector {
    public void mackCommputer(ComputerBuild computer){
        computer.BuildKeybord();
        computer.BuildDisplay();
        computer.BuildUsbCount();
    }
}
