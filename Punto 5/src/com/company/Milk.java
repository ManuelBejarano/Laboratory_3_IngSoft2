package com.company;

public class Milk extends OrdenDecorator{

    Milk(Orden orden) {
        super(orden);
    }

    @Override
    public String Pedido(String x) {
        return super.Pedido("with milk "+ x);
    }
}
