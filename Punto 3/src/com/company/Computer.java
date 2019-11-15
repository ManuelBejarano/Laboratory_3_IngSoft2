package com.company;

public class Computer {
    private final Type type;
    private final Ram ram;
    private final Hd hd;

    public Computer(Type type, Ram ram, Hd hd){
        this.type=type;
        this.ram=ram;
        this.hd=hd;
    }

    public Type getType() {
        return type;
    }

    public Ram getRam() {
        return ram;
    }

    public Hd getHd() {
        return hd;
    }
}
