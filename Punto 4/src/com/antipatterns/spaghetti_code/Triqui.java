package com.antipatterns.spaghetti_code;
import java.util.Scanner;
import java.util.Random;

public class Triqui {


    public void crearTriquiYJugar() {


        //Inicio: Bievenida y tamaño de cuadro
        Scanner scan = new Scanner(System.in);
        System.out.print("Tamaño del triqui: ");
        int tamaño_cuadro = scan.nextInt();
        //Final: Bievenida y tamaño de cuadro


        //Inicio:Creando el cuadro de triqui
        char[][] triqui = new char [tamaño_cuadro][tamaño_cuadro];

        for(int fila = 0; fila < triqui.length; fila++){
            for(int columna = 0; columna < triqui.length; columna++){
                triqui[fila][columna] = '-';
            }
        }
        //Final :Creando el cuadro de triqui


        jugarTriqui(tamaño_cuadro, triqui);
    }

    public static void jugarTriqui(int tamaño_cuadro, char[][] triqui){


        //Inicio:Elegir posicion al azar de la maquina
        boolean jugar = true;
        int val = 0;
        int val_1 = 0;
        int jugadas = 0;

        while(jugar){
            Random randFila = new Random();
            int posicionFilaComp = randFila.nextInt(tamaño_cuadro);
            Random randColumna = new Random();
            int posicionColumnaComp = randColumna.nextInt(tamaño_cuadro);


            //Inicio:Verificacion de que no se sobreescriba una casilla por computador
            while(triqui[posicionFilaComp][posicionColumnaComp] == 'O' ||
                    triqui[posicionFilaComp][posicionColumnaComp] == 'X'){
                posicionFilaComp = randFila.nextInt(tamaño_cuadro);
                posicionColumnaComp = randColumna.nextInt(tamaño_cuadro);
            }//Final:Verificacion de que no se sobreescriba una casilla por computador


            triqui[posicionFilaComp][posicionColumnaComp] = 'X';
            System.out.println(" ");

            int cont = 0;
            System.out.println("Matriz computador");
            for(int fila = 0; fila < triqui.length; fila++){
                for(int columna = 0; columna < triqui.length; columna++){
                    System.out.print(triqui[fila][columna]);
                    System.out.print("\t");
                    cont = cont + 1;

                    if(cont % tamaño_cuadro == 0){
                        System.out.println(" ");
                    }
                }
            }
            //Final:Elegir posicion al azar de la maquina


            //Inicio:Revisar si hay linea completa en la jugada de la máquina
            if( (posicionFilaComp - 1 >  -1) && (posicionFilaComp - 1 <  triqui.length) //1
                    && (posicionFilaComp + 1 > -1) && (posicionFilaComp + 1 < triqui.length) ){

                if (triqui[posicionFilaComp - 1][posicionColumnaComp]== 'X'
                        && triqui[posicionFilaComp + 1][posicionColumnaComp]== 'X'){
                    val = val + 1;
                }
            }

            if( (posicionFilaComp - 1 >  -1) && (posicionFilaComp - 1 <  triqui.length) //2
                    && (posicionFilaComp + 1 > -1) && (posicionFilaComp + 1 < triqui.length)
                    && (posicionColumnaComp - 1 > -1) && (posicionColumnaComp - 1 <  triqui.length)
                    && (posicionColumnaComp + 1 > -1) && (posicionColumnaComp + 1 < triqui.length) ){
                if(triqui[posicionFilaComp - 1][posicionColumnaComp - 1]== 'X'
                        && triqui[posicionFilaComp + 1][posicionColumnaComp + 1]== 'X'){
                    val = val +1;
                }
            }

            if( (posicionColumnaComp - 1 >  -1) && (posicionColumnaComp - 1 <  triqui.length) //3
                    && (posicionColumnaComp + 1 > -1) && (posicionColumnaComp + 1 < triqui.length) ){
                if(triqui[posicionFilaComp][posicionColumnaComp - 1]== 'X'
                        && triqui[posicionFilaComp][posicionColumnaComp + 1]== 'X'){
                    val = val + 1;
                }
            }

            if( (posicionFilaComp + 1 >  -1) && (posicionFilaComp + 1 <  triqui.length) //4
                    && (posicionFilaComp - 1 > -1) && (posicionFilaComp - 1 < triqui.length)
                    && (posicionColumnaComp - 1 > -1) && (posicionColumnaComp - 1 <  triqui.length)
                    && (posicionColumnaComp + 1 > -1) && (posicionColumnaComp + 1 < triqui.length) ){
                if(triqui[posicionFilaComp + 1][posicionColumnaComp - 1]== 'X'
                        && triqui[posicionFilaComp - 1][posicionColumnaComp + 1]== 'X'){
                    val = val + 1;
                }
            }

            if( (posicionFilaComp + 1 > -1) && (posicionFilaComp + 1 <  triqui.length) //5
                    && (posicionFilaComp + 2 > -1) && (posicionFilaComp + 2 < triqui.length)){
                if(triqui[posicionFilaComp + 1][posicionColumnaComp]== 'X'
                        && triqui[posicionFilaComp + 2][posicionColumnaComp]== 'X'){
                    val = val + 1;
                }
            }

            if( (posicionFilaComp + 1 >  -1) && (posicionFilaComp + 1 <  triqui.length) //6
                    && (posicionFilaComp + 2 > -1) && (posicionFilaComp + 2 < triqui.length)
                    && (posicionColumnaComp + 2 > -1) && (posicionColumnaComp + 2 <  triqui.length)
                    && (posicionColumnaComp + 1 > -1) && (posicionColumnaComp + 1 < triqui.length) ){
                if(triqui[posicionFilaComp + 1][posicionColumnaComp + 1]== 'X'
                        && triqui[posicionFilaComp + 2][posicionColumnaComp + 2]== 'X'){
                    val = val + 1;
                }
            }

            if((posicionColumnaComp + 1 > -1) && (posicionColumnaComp + 1 <  triqui.length) //7
                    && (posicionColumnaComp + 2 > -1) && (posicionColumnaComp + 2 < triqui.length)){
                if(triqui[posicionFilaComp][posicionColumnaComp + 1]== 'X'
                        && triqui[posicionFilaComp][posicionColumnaComp + 2]== 'X'){
                    val = val + 1;
                }
            }

            if( (posicionFilaComp - 1 >  -1) && (posicionFilaComp - 1 <  triqui.length) //8
                    && (posicionFilaComp - 2 > -1) && (posicionFilaComp - 2 != triqui.length)
                    && (posicionColumnaComp + 2 > -1) && (posicionColumnaComp + 2 <  triqui.length)
                    && (posicionColumnaComp + 1 > -1) && (posicionColumnaComp + 1 < triqui.length) ){
                if(triqui[posicionFilaComp - 1][posicionColumnaComp + 1]== 'X'
                        && triqui[posicionFilaComp - 2][posicionColumnaComp + 2]== 'X'){
                    val = val + 1;
                }
            }

            if((posicionFilaComp - 1 > -1) && (posicionFilaComp - 1 !=  triqui.length) //9
                    && (posicionFilaComp - 2 > -1) && (posicionFilaComp - 2 != triqui.length)){
                if(triqui[posicionFilaComp - 1][posicionColumnaComp]== 'X'
                        && triqui[posicionFilaComp - 2][posicionColumnaComp]== 'X'){
                    val = val + 1;
                }
            }

            if( (posicionFilaComp - 1 >  -1) && (posicionFilaComp - 1 <  triqui.length) //10
                    && (posicionFilaComp - 2 > -1) && (posicionFilaComp - 2 < triqui.length)
                    && (posicionColumnaComp - 2 > -1) && (posicionColumnaComp - 2 <  triqui.length)
                    && (posicionColumnaComp - 1 > -1) && (posicionColumnaComp - 1 < triqui.length) ){
                if(triqui[posicionFilaComp - 1][posicionColumnaComp - 1]== 'X'
                        && triqui[posicionFilaComp - 2][posicionColumnaComp - 2]== 'X'){
                    val = val + 1;
                }
            }

            if( (posicionColumnaComp - 1 > -1) && (posicionColumnaComp - 1 <  triqui.length) //11
                    && (posicionColumnaComp - 2 > -1) && (posicionColumnaComp - 2 < triqui.length) ){
                if(triqui[posicionFilaComp][posicionColumnaComp - 1]== 'X'
                        && triqui[posicionFilaComp][posicionColumnaComp - 2]== 'X'){
                    val = val + 1;
                }
            }

            if( (posicionFilaComp + 1 >  -1) && (posicionFilaComp + 1 <  triqui.length) //12
                    && (posicionFilaComp + 2 > -1) && (posicionFilaComp + 2 < triqui.length)
                    && (posicionColumnaComp - 2 > -1) && (posicionColumnaComp - 2 <  triqui.length)
                    && (posicionColumnaComp - 1 > -1) && (posicionColumnaComp - 1 < triqui.length) ){
                if(triqui[posicionFilaComp + 1][posicionColumnaComp - 1]== 'X'
                        && triqui[posicionFilaComp + 2][posicionColumnaComp - 2]== 'X'){
                    val = val + 1;
                }
            }
            //Final:Revisar si hay linea completa en la jugada de la máquina

            //Inicio:Validar si gana, pierde o continúa
            jugadas = jugadas + 1;
            if(jugadas >= (tamaño_cuadro * tamaño_cuadro)){
                System.out.println("Es un empate!");
                jugar = false;
                break;
            }if(val > 0){
                System.out.println("La máquina ganó! WIIII!");
                jugar = false;
            }else{
                //Inicio:Pedir posicion al usuario
                Scanner scan = new Scanner(System.in);
                System.out.print("Escriba la FILA (↔) de su jugada: ");
                int posicionFilaUs = scan.nextInt() - 1;
                System.out.print("Escriba la COLUMNA (↕) de su jugada: ");
                int posicionColumnaUs = scan.nextInt() - 1;
                System.out.println(" ");

                //Inicio:Verificacion de que no se sobreescriba una casilla por usuario
                while(triqui[posicionFilaUs][posicionColumnaUs] == 'O' ||
                        triqui[posicionFilaUs][posicionColumnaUs] == 'X'){

                    System.out.print("Ha ingresado una posicion ya ocupada. \nEscriba la FILA (↔) de su nueva jugada: ");
                    posicionFilaUs = scan.nextInt() - 1;
                    System.out.print("Escriba la COLUMNA (↕) de su nueva jugada: ");
                    posicionColumnaUs = scan.nextInt() - 1;
                    System.out.println(" ");
                }//Final:Verificacion de que no se sobreescriba una casilla por usuario

                triqui[posicionFilaUs][posicionColumnaUs] = 'O';
                System.out.println(" ");

                int cont2 = 0;
                System.out.println("Matriz usuario");
                for(int fila = 0; fila < triqui.length; fila++){
                    for(int columna = 0; columna < triqui.length; columna++){
                        System.out.print(triqui[fila][columna]);
                        System.out.print("\t");
                        cont2 = cont2 + 1;

                        if(cont2 % tamaño_cuadro == 0){
                            System.out.println(" ");
                        }
                    }
                }

                //Inicio:Revisar si hay linea completa en la jugada del usuario
                if( (posicionFilaUs - 1 !=  -1) && (posicionFilaUs - 1 <  triqui.length) //1
                        && (posicionFilaUs + 1 != -1) && (posicionFilaUs + 1 < triqui.length) ){
                    if (triqui[posicionFilaUs - 1][posicionColumnaUs]== 'O'
                            && triqui[posicionFilaUs + 1][posicionColumnaUs]== 'O'){
                        val_1 = val_1 + 1;
                    }
                }

                if( (posicionFilaUs - 1 !=  -1) && (posicionFilaUs - 1 <  triqui.length) //2
                        && (posicionFilaUs + 1 != -1) && (posicionFilaUs + 1 < triqui.length)
                        && (posicionColumnaUs - 1 != -1) && (posicionColumnaUs - 1 <  triqui.length)
                        && (posicionColumnaUs + 1 != -1) && (posicionColumnaUs + 1 < triqui.length) ){
                    if(triqui[posicionFilaUs - 1][posicionColumnaUs - 1]== 'O'
                            && triqui[posicionFilaUs + 1][posicionColumnaUs + 1]== 'O'){
                        val_1 = val_1 +1;
                    }
                }

                if( (posicionColumnaUs - 1 !=  -1) && (posicionColumnaUs - 1 <  triqui.length) //3
                        && (posicionColumnaUs + 1 != -1) && (posicionColumnaUs + 1 < triqui.length) ){
                    if(triqui[posicionFilaUs][posicionColumnaUs - 1]== 'O'
                            && triqui[posicionFilaUs][posicionColumnaUs + 1]== 'O'){
                        val_1 = val_1 + 1;
                    }
                }

                if( (posicionFilaUs + 1 !=  -1) && (posicionFilaUs + 1 <  triqui.length) //4
                        && (posicionFilaUs - 1 != -1) && (posicionFilaUs - 1 < triqui.length)
                        && (posicionColumnaUs - 1 != -1) && (posicionColumnaUs - 1 <  triqui.length)
                        && (posicionColumnaUs + 1 != -1) && (posicionColumnaUs + 1 < triqui.length) ){
                    if(triqui[posicionFilaUs + 1][posicionColumnaUs - 1]== 'O'
                            && triqui[posicionFilaUs - 1][posicionColumnaUs + 1]== 'O'){
                        val_1 = val_1 + 1;
                    }
                }

                if( (posicionFilaUs + 1 != -1) && (posicionFilaUs + 1 <  triqui.length) //5
                        && (posicionFilaUs + 2 != -1) && (posicionFilaUs + 2 < triqui.length)){
                    if(triqui[posicionFilaUs + 1][posicionColumnaUs]== 'O'
                            && triqui[posicionFilaUs + 2][posicionColumnaUs]== 'O'){
                        val_1 = val_1 + 1;
                    }
                }

                if( (posicionFilaUs + 1 !=  -1) && (posicionFilaUs + 1 <  triqui.length) //6
                        && (posicionFilaUs + 2 != -1) && (posicionFilaUs + 2 < triqui.length)
                        && (posicionColumnaUs + 2 != -1) && (posicionColumnaUs + 2 <  triqui.length)
                        && (posicionColumnaUs + 1 != -1) && (posicionColumnaUs + 1 < triqui.length) ){
                    if(triqui[posicionFilaUs + 1][posicionColumnaUs + 1]== 'O'
                            && triqui[posicionFilaUs + 2][posicionColumnaUs + 2]== 'O'){
                        val_1 = val_1 + 1;
                    }
                }

                if((posicionColumnaUs + 1 != -1) && (posicionColumnaUs + 1 <  triqui.length) //7
                        && (posicionColumnaUs + 2 != -1) && (posicionColumnaUs + 2 < triqui.length)){
                    if(triqui[posicionFilaUs][posicionColumnaUs + 1]== 'O'
                            && triqui[posicionFilaUs][posicionColumnaUs + 2]== 'O'){
                        val_1 = val_1 + 1;
                    }
                }

                if( (posicionFilaUs - 1 !=  -1) && (posicionFilaUs - 1 <  triqui.length) //8
                        && (posicionFilaUs - 2 != -1) && (posicionFilaUs - 2 != triqui.length)
                        && (posicionColumnaUs + 2 != -1) && (posicionColumnaUs + 2 <  triqui.length)
                        && (posicionColumnaUs + 1 != -1) && (posicionColumnaUs + 1 < triqui.length) ){
                    if(triqui[posicionFilaUs - 1][posicionColumnaUs + 1]== 'O'
                            && triqui[posicionFilaUs - 2][posicionColumnaUs + 2]== 'O'){
                        val_1 = val_1 + 1;
                    }
                }

                if((posicionFilaUs - 1 != -1) && (posicionFilaUs - 1 !=  triqui.length) //9
                        && (posicionFilaUs - 2 != -1) && (posicionFilaUs - 2 != triqui.length)){
                    if(triqui[posicionFilaUs - 1][posicionColumnaUs]== 'O'
                            && triqui[posicionFilaUs - 2][posicionColumnaUs]== 'O'){
                        val_1 = val_1 + 1;
                    }
                }

                if( (posicionFilaUs - 1 !=  -1) && (posicionFilaUs - 1 <  triqui.length) //10
                        && (posicionFilaUs - 2 != -1) && (posicionFilaUs - 2 < triqui.length)
                        && (posicionColumnaUs - 2 != -1) && (posicionColumnaUs - 2 <  triqui.length)
                        && (posicionColumnaUs - 1 != -1) && (posicionColumnaUs - 1 < triqui.length) ){
                    if(triqui[posicionFilaUs - 1][posicionColumnaUs - 1]== 'O'
                            && triqui[posicionFilaUs - 2][posicionColumnaUs - 2]== 'O'){
                        val_1 = val_1 + 1;
                    }
                }

                if( (posicionColumnaUs - 1 != -1) && (posicionColumnaUs - 1 <  triqui.length) //11
                        && (posicionColumnaUs - 2 != -1) && (posicionColumnaUs - 2 < triqui.length) ){
                    if(triqui[posicionFilaUs][posicionColumnaUs - 1]== 'O'
                            && triqui[posicionFilaUs][posicionColumnaUs - 2]== 'O'){
                        val_1 = val_1 + 1;
                    }
                }

                if( (posicionFilaUs + 1 !=  -1) && (posicionFilaUs + 1 <  triqui.length) //12
                        && (posicionFilaUs + 2 != -1) && (posicionFilaUs + 2 < triqui.length)
                        && (posicionColumnaUs - 2 != -1) && (posicionColumnaUs - 2 <  triqui.length)
                        && (posicionColumnaUs - 1 != -1) && (posicionColumnaUs - 1 < triqui.length) ){
                    if(triqui[posicionFilaUs + 1][posicionColumnaUs - 1]== 'O'
                            && triqui[posicionFilaUs + 2][posicionColumnaUs - 2]== 'O'){
                        val_1 = val_1 + 1;
                    }
                }
                //Final:Revisar si hay linea completa en la jugada del usuario
            }
            jugadas = jugadas + 1;
            if(jugadas >= (tamaño_cuadro * tamaño_cuadro)){
                System.out.println("Es un empate!");
                jugar = false;
                break;
            }if(val_1 > 0){
                System.out.println("Usted ganó! WIIII!");
                jugar = false;
            }
            //Final:Validar si gana, pierde o continúa
        }

    }
}
