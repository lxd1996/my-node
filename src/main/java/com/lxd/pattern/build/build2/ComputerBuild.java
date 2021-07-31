package com.lxd.pattern.build.build2;

/**
 * @Author lxd
 * @Date 2021/7/31 22:21
 **/
public abstract class ComputerBuild {
    public abstract void BuildKeybord();
    public abstract void BuildDisplay();
    public abstract void BuildUsbCount();

    public abstract Computer getComputer();

}
