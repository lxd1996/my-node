package com.lxd.pattern.build.build2;

import javax.naming.MalformedLinkException;

/**
 * @Author lxd
 * @Date 2021/7/31 22:32
 **/
public class Test {
    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        ComputerBuild computer = new MacComputerBuild("intel","东芝");
        computerDirector.mackCommputer(computer);
        Computer computer1 = computer.getComputer();
        System.out.println(computer1.toString());

        ComputerBuild computer2 = new LenvooComputerBuilld("amd","联想");
        computerDirector.mackCommputer(computer2);
        Computer computer3 = computer2.getComputer();
        System.out.println(computer3.toString());

    }
}
