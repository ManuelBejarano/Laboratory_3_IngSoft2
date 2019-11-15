package com.company;

public class Mocha extends OrdenDecorator {

    Mocha(Orden orden) {
        super(orden);
    }

    @Override
    public String Pedido(String x) {
        return super.Pedido("mocha with figure in the cover" + x);
    }
}
