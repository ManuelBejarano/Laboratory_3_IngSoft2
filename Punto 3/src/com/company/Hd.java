package com.company;

public class Hd {
    private double capacidad;
    private String marca;

    public Hd(double capacidad, String marca){
        this.capacidad=capacidad;
        this.marca=marca;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
