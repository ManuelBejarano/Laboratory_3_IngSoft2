package com.company;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        ComputerBuilder builder = new ComputerBuilder();
        director.ConstructGamingComputer(builder);

        Computer computer = builder.getResult();

        System.out.println("Tipo de computador:\n"+computer.getType()+"\nMemoria ram:\n"+computer.getRam().getCapacidad()+"Gb");

    }
}
