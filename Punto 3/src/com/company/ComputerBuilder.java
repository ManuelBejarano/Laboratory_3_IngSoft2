package com.company;

public class ComputerBuilder implements Builder{

    private Type type;
    private Ram ram;
    private Hd hd;


    @Override
    public void SetType(Type type) {
        this.type=type;
    }

    @Override
    public void SetRam(Ram ram) {
        this.ram=ram;
    }

    @Override
    public void SetHd(Hd hd) {
        this.hd=hd;
    }

    public Computer getResult(){
        return new  Computer(type, ram, hd);
    }
}
