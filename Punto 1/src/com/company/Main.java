package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static Estrategia metodo;
    public static void main(String[] args) {
        System.out.println("cuanto tiempo tiene?\nPoco digite 1.\nMedio Digite 2.\nMucho digite 3.");
        int tiempo=Verificar();
        System.out.println("cuanto Presupuesto tiene?\nPoco digite 1.\nMedio Digite 2.\nMucho digite 3.");
        int presupuesto=Verificar();
        if(presupuesto==3){
            if(tiempo==3){
                metodo=new Cicla();
            }else if(tiempo==2){
                metodo = new Bus();
            }else if(tiempo==1){
                metodo = new Taxi();
            }
        }else if(presupuesto==2){
            if(tiempo==3){
                metodo = new Cicla();
            }else if(tiempo==2){
                metodo = new Bus();
            }
        }else if(presupuesto==1){
            if(tiempo==3){
                metodo=new Cicla();
            }
        }
        if(metodo==null){
            metodo = new Nada();
        }
        System.out.println(metodo.Desicion());
    }

    public static int Verificar(){
        int x = 0;
        int aux=0;
        while(x<1||x>3){
            if(aux>0){
                System.out.println("Digite un numero valido:");
            }
            aux++;
            try{
                x = Integer.parseInt(READER.readLine());
            }catch(Exception e){
            }
        }
        return x;
    }
}
