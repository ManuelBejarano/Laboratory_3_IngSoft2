package com.antipatterns.spaghetti_code;


public class Play {

    public static void main(String[] args) {
        System.out.println("Bienvenido a Triqui!!");
        System.out.println("Se elegir� el primer jugador al azar");
        int[] jugadores = {1, 2};

        int rand = (int) (Math.random() * jugadores.length);;

        switch(rand){
            case 0:
                System.out.println("El primer jugador ser� la m�quina.");
                Triqui miComputador = new Triqui();
                miComputador.crearTriquiYJugar();
                break;
        }

    }

}

