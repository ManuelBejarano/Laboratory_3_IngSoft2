package com.company;

public class CookTime extends   OrdenDecorator {
    CookTime(Orden orden) {
        super(orden);
    }

    @Override
    public String Pedido(String x) {
        return super.Pedido("with cook time " + x);
    }
}
