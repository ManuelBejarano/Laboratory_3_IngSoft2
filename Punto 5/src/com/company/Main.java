package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        OrdenDecorator cafe;
        int aux;
        System.out.println("que cafe quiere:\n1. Simple\n2. Elementary\n3. Sophisticated\n4. Basic\n5. Advanced");
        aux = verificar();
        switch (aux){
            case 1:
                cafe= new OrdenDecorator(new Coffe());
                break;
            case 2:
                cafe = new Milk(new Coffe());
                break;
            case 3:
                cafe = new CookTime(new Milk(new Coffe()));
                break;
            case 4:
                cafe = new CookTime(new Coffe());
                break;
            case 5:
                cafe = new Mocha((new Coffe()));
                break;
            default:
                cafe =  new OrdenDecorator(new Coffe());
        }
        System.out.println(cafe.Pedido(""));


    }

    public static int verificar(){
        int x=0;
        int aux=0;
        while(x < 1 || aux > 5){
            if(aux>0){
                System.out.println("digite un numero valido");
            }
            aux++;
            try{
                x=Integer.parseInt(reader.readLine());

            }catch (Exception e){
            }
        }
        return x;
    }
}