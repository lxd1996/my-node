package com.lxd.pattern.build.build1;

import lombok.Data;

/**
 * @Author lxd
 * @Date 2021/7/31 22:04
 **/
@Data
public class Computer {
    private final String cpu;//必须
    private final String ram;//必须
    private final int usbCount;//可选
    private final String keyboard;//可选
    private final String display;//可选

    private Computer(ComputerBuild computerBuild){
        this.cpu=computerBuild.cpu;
        this.ram=computerBuild.ram;
        this.usbCount=computerBuild.usbCount;
        this.keyboard=computerBuild.keyboard;
        this.display=computerBuild.display;

    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }

    static class ComputerBuild{
     private String cpu;//必须
     private String ram;//必须
     private int usbCount;//可选
     private String keyboard;//可选
     private String display;//可选

     public ComputerBuild(String cpu,String ram){
         this.cpu = cpu;
         this.ram = ram;
     }

     public ComputerBuild buildUsbCounnt(int usbCount){
         this.usbCount = usbCount;
         return this;
     }
     public ComputerBuild buildKeybord(String keyboard){
         this.keyboard = keyboard;
         return this;
     }
     public ComputerBuild buildDisplay(String display){
         this.display = display;
         return this;
     }

     public Computer build(){
         return new Computer(this);
     }
 }
}
