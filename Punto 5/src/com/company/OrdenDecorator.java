package com.company;

public class OrdenDecorator implements Orden{
    private Orden wrappee;

    OrdenDecorator(Orden orden){
        this.wrappee=orden;
    }

    @Override
    public String Pedido(String data){
        return wrappee.Pedido(data);
    }

}