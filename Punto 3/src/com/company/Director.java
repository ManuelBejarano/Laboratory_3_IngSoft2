package com.company;

public class Director {
    public void ConstructMesaComputer(Builder builder){
        builder.SetType(Type.MESA);
        builder.SetRam(new Ram(8, "Kingston"));
        builder.SetHd(new Hd(1000,"Adata"));
    }

    public void ConstructPortatilComputer(Builder builder){
        builder.SetType(Type.PORTATIL);
        builder.SetRam(new Ram(4, "Hyperx"));
        builder.SetHd(new Hd(500,"Toshiba"));
    }

    public void ConstructGamingComputer(Builder builder){
        builder.SetType(Type.GAMING);
        builder.SetRam(new Ram(16, "Vegeance"));
        builder.SetHd(new Hd(2000,"Seagate"));
    }


}
