package com.lxd.pattern.build;

/**
 * @Author lxd
 * @Date 2021/7/31 21:44
 **/
public class BuildHumenImpl implements BuildHumen{

    Humen humen;
    BuildHumenImpl(){
        humen = new Humen();
    }

    @Override
    public BuildHumen buildName() {
        humen.setName("name");
        System.out.println(humen.getName());
        return this;
    }

    @Override
    public BuildHumen buildAge() {
        humen.setAge(12);
        System.out.println(humen.getAge());
        return this;
    }

    @Override
    public BuildHumen buildAddress() {
        humen.setAddress("address");
        System.out.println(humen.getAddress());
        return this;
    }

    @Override
    public Humen builfHumrn() {
        return this.humen;
    }
}
