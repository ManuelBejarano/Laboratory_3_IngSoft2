package com.antipatterns.the_blob.business;


import java.util.Scanner;

import com.antipatterns.the_blob.ui.*;
import com.antipatterns.the_blob.data.*;

public class ShapeCalculatorTest {

    public static void main(String[] args) {
        Scanner readerInt = new Scanner(System.in);
        Scanner readerDouble = new Scanner(System.in);
        ShapeCalculatorUI.imprimirPantallaInicio();
        int opcion;
        do {
            double lado = 0;
            double base = 0;
            double altura = 0;
            double lado1 = 0;
            double lado2 = 0;
            double lado3 = 0;
            double lado4 = 0;
            double radio = 0;
            ShapeCalculatorUI.imprimirMenuPrincipal();
            opcion = readerInt.nextInt();
            switch (opcion) {
                case 1:
                    ShapeCalculatorUI.imprimirTituloCalculadoraCuadrado();
                    do {
                        ShapeCalculatorUI.imprimirNombreLadoIngresoEl("lado (L)");

                        lado = readerDouble.nextDouble();
                        if (lado <= 0) {
                            ShapeCalculatorUI.imprimirErrorDigitoMenorACero();
                        }
                    } while (lado <= 0);
                    Forma cuadrado = new Cuadrado(lado);
                    calcularCuadrado(cuadrado);
                    ShapeCalculatorUI.printShapeAreaPerimeter(cuadrado);
                    break;
                case 2:// para rectángulo
                    ShapeCalculatorUI.imprimirTituloCalculadoraRectangulo();
                    do {
                        ShapeCalculatorUI.imprimirNombreLadoIngresoLa("base");
                        base = readerDouble.nextDouble();
                        ShapeCalculatorUI.imprimirNombreLadoIngresoLa("altura");
                        altura = readerDouble.nextDouble();
                        if (base <= 0 || altura <= 0) {
                            ShapeCalculatorUI.imprimirErrorDigitoMenorACero();
                        }
                    } while (base <= 0 || altura <= 0);
                    // do while que verifica que los valores nunca sean menores a 0
                    // se usa en todos los ingresos de datos del programa
                    Forma rectangulo = new Rectangulo(base, altura);
                    calcularRectangulo(rectangulo);
                    ShapeCalculatorUI.printShapeAreaPerimeter(rectangulo);
                    break;
                case 3:// menú trapecio
                    ShapeCalculatorUI.imprimirMenuTrapecio();
                    int opcion1 = readerInt.nextInt();
                    switch (opcion1) {
                        case 1:// para trapecio isosceles
                            ShapeCalculatorUI
                                    .imprimirTituloCalculadoraTrapecioIsosceles();
                            do {
                                ShapeCalculatorUI
                                        .imprimirNombreLadoIngresoLa("Base Mayor (BM)");
                                lado3 = readerDouble.nextDouble();
                                ShapeCalculatorUI
                                        .imprimirNombreLadoIngresoLa("Base Menor (ḇm)");
                                lado1 = readerDouble.nextDouble();
                                if (lado1 > lado3) {
                                    ShapeCalculatorUI.imprimirErrorBaseTrapecio();
                                }
                                if (lado1 <= 0 || lado3 <= 0) {
                                    ShapeCalculatorUI.imprimirErrorDigitoMenorACero();
                                }
                            } while (lado1 > lado3 || lado1 <= 0 || lado3 <= 0);

                            int aux;
                            // variable aux genereda por fuera para no generar problemas
                            // dentro del do-while
                            do {
                                ShapeCalculatorUI
                                        .imprimirOpcionAlturaLadosTrapecioIsosceles();
                                aux = readerInt.nextInt();
                                if (aux != 1 && aux != 2) {
                                    ShapeCalculatorUI.imprimirError();
                                }
                            } while (aux != 1 && aux != 2);
                            Forma trapecioIsosceles = null;
                            if (aux == 1) {
                                do {
                                    ShapeCalculatorUI
                                            .imprimirNombreLadoIngresoEl("lado (L) del trapecio (recuerde que ambos lados son iguales)");
                                    lado2 = readerDouble.nextDouble();
                                    if (lado2 <= 0) {
                                        ShapeCalculatorUI
                                                .imprimirErrorDigitoMenorACero();
                                    }
                                } while (lado2 <= 0);
                                lado4 = lado2;
                                trapecioIsosceles = retornarTrapecioIsosceles(lado1,
                                        lado2, lado3, lado4);
                            } else if (aux == 2) {
                                do {
                                    ShapeCalculatorUI
                                            .imprimirNombreLadoIngresoLa("altura (h) del trapecio");
                                    altura = readerDouble.nextDouble();
                                    if (altura <= 0) {
                                        ShapeCalculatorUI
                                                .imprimirErrorDigitoMenorACero();
                                    }
                                } while (altura <= 0);
                                trapecioIsosceles = retornarTrapecioIsosceles(lado1,
                                        lado3, altura);
                            }
                            calcularTrapecioIsosceles(trapecioIsosceles);
                            ShapeCalculatorUI
                                    .printShapeAreaPerimeter(trapecioIsosceles);
                            break;
                        case 2:// para trapecio rectangulo
                            ShapeCalculatorUI
                                    .imprimirTituloCalculadoraTrapecioRectangulo();
                            do {
                                ShapeCalculatorUI
                                        .imprimirNombreLadoIngresoLa("Base Mayor (BM)");
                                lado3 = readerDouble.nextDouble();
                                ShapeCalculatorUI
                                        .imprimirNombreLadoIngresoLa("Base Menor (bm)");
                                lado1 = readerDouble.nextDouble();
                                if (lado1 > lado3) {
                                    ShapeCalculatorUI.imprimirErrorBaseTrapecio();
                                }
                                if (lado1 <= 0 || lado3 <= 0) {
                                    ShapeCalculatorUI.imprimirErrorDigitoMenorACero();
                                }
                            } while (lado1 > lado3 || lado1 <= 0 || lado3 <= 0);
                            do {
                                ShapeCalculatorUI
                                        .imprimirOpcionAlturaLadosTrapecioRectangulo();
                                aux = readerInt.nextInt();
                                if (aux != 1 && aux != 2) {
                                    ShapeCalculatorUI.imprimirError();
                                }
                            } while (aux != 1 && aux != 2);
                            Forma trapecioRectangulo = null;

                            if (aux == 1) {
                                do {
                                    ShapeCalculatorUI
                                            .imprimirNombreLadoIngresoEl("lado recto (h) del trapecio");
                                    altura = readerDouble.nextDouble();
                                    if (altura <= 0) {
                                        ShapeCalculatorUI
                                                .imprimirErrorDigitoMenorACero();
                                    }
                                } while (altura <= 0);
                                lado4 = altura;
                                do {
                                    ShapeCalculatorUI
                                            .imprimirNombreLadoIngresoEl("lado (L) que tiene la inclinación en el trapecio");
                                    lado2 = readerDouble.nextDouble();
                                    if (lado2 >= 0) {
                                        ShapeCalculatorUI
                                                .imprimirErrorDigitoMenorACero();
                                    }
                                } while (lado2 <= 0);
                                trapecioRectangulo = new TrapecioRectangulo(lado1,
                                        lado2, lado3, lado4, altura);
                            } else if (aux == 2) {
                                do {
                                    ShapeCalculatorUI
                                            .imprimirNombreLadoIngresoLa("altura (h) del trapecio");
                                    altura = readerDouble.nextDouble();
                                    if (altura <= 0) {
                                        ShapeCalculatorUI
                                                .imprimirErrorDigitoMenorACero();
                                    }
                                } while (altura <= 0);
                                lado4 = altura;
                                trapecioRectangulo = retornarTrapecioRectangulo(lado1,
                                        lado3, lado4, altura);
                            }
                            calcularTrapecioRectangulo(trapecioRectangulo);
                            ShapeCalculatorUI
                                    .printShapeAreaPerimeter(trapecioRectangulo);
                            break;
                        case 0:
                            break;// volver al menu anterior
                        default:
                            ShapeCalculatorUI.imprimirError();
                            break;
                    }
                    break;
                case 4:// para triangulo equilátero
                    ShapeCalculatorUI
                            .imprimirTituloCalculadoraTrianguloEquilatero();
                    do {
                        ShapeCalculatorUI.imprimirIngresoUnicoLado();
                        lado = readerDouble.nextDouble();
                        if (lado <= 0) {
                            ShapeCalculatorUI.imprimirErrorDigitoMenorACero();
                        }
                    } while (lado <= 0);
                    // do-while que verifica que los valores nunca sean menores o
                    // iguales a 0
                    Forma tEquilatero = new Equilatero(lado);
                    calcularTEquilatero(tEquilatero);
                    ShapeCalculatorUI.printShapeAreaPerimeter(tEquilatero);
                    break;
                case 5:// para triangulo isósceles
                    ShapeCalculatorUI.imprimirTituloCalculadoraTrianguloIsosceles();
                    do {
                        ShapeCalculatorUI.imprimirNombreLadoIngresoLa("base");
                        base = readerDouble.nextDouble();
                        if (base <= 0) {
                            ShapeCalculatorUI.imprimirErrorDigitoMenorACero();
                        }
                    } while (base <= 0);
                    int aux;
                    do {
                        ShapeCalculatorUI
                                .imprimirOpcionAlturaLadosTrapecioIsosceles();
                        aux = readerInt.nextInt();
                        if (aux != 1 && aux != 2) {
                            ShapeCalculatorUI.imprimirError();
                        }
                    } while (aux != 1 && aux != 2);
                    Forma tIsosceles = null;
                    // tIsosceles se crea inicialmente por fuera de los if, y
                    // después
                    // asignarles el objeto según los datos ingresados por el
                    // usuario
                    double lados; // toca crear la variable afuera para que no cree
                    // problema con el do-while
                    if (aux == 1) {
                        do {
                            ShapeCalculatorUI
                                    .imprimirNombreLadoIngresoEl("lado (L) del triángulo (recuerde que ambos lados son iguales");
                            lados = readerDouble.nextDouble();
                            if (base >= (lados * 2)) {
                                ShapeCalculatorUI.imprimirErrorTriangulo();
                                ShapeCalculatorUI
                                        .imprimirNombreLadoIngresoLa("base");
                                base = readerDouble.nextDouble();
                            }
                        } while (base >= (lados * 2));
                        tIsosceles = retornarTrianguloIsosceles(lados, base, altura);
                    } else if (aux == 2) {
                        do {
                            ShapeCalculatorUI
                                    .imprimirNombreLadoIngresoLa("altura (h) del triangulo");
                            altura = readerDouble.nextDouble();
                            if (altura <= 0) {
                                ShapeCalculatorUI.imprimirErrorDigitoMenorACero();
                            }
                        } while (altura <= 0);
                        tIsosceles = retornarTrianguloIsosceles(base, altura);
                    }
                    calcularIsosceles(tIsosceles);
                    ShapeCalculatorUI.printShapeAreaPerimeter(tIsosceles);

                    break;
                case 6:// para triangulo escaleno
                    ShapeCalculatorUI.imprimirTituloCalculadoraTrianguloEscaleno();
                    do {
                        ShapeCalculatorUI.imprimirNombreLadoIngresoEl("lado (L1)");
                        lado1 = readerDouble.nextDouble();
                        ShapeCalculatorUI.imprimirNombreLadoIngresoEl("lado (L2)");
                        lado2 = readerDouble.nextDouble();
                        ShapeCalculatorUI.imprimirNombreLadoIngresoEl("lado (L3)");
                        lado3 = readerDouble.nextDouble();
                        if (lado1 >= (lado2 + lado3) || lado2 >= (lado1 + lado3)
                                || lado3 >= (lado1 + lado2)) {
                            ShapeCalculatorUI.imprimirErrorTriangulo();
                        }
                    } while (lado1 >= (lado2 + lado3) || lado2 >= (lado1 + lado3)
                            || lado3 >= (lado1 + lado2));
                    // do-while que verifica que un lado no sea mayor a la suma de
                    // los otros 2
                    Forma tEscaleno = new Escaleno(lado1, lado2, lado3);
                    calcularEscaleno(tEscaleno);
                    ShapeCalculatorUI.printShapeAreaPerimeter(tEscaleno);
                    break;
                case 7:
                    ShapeCalculatorUI.imprimirTituloCalculadoraCirculo();
                    do {
                        ShapeCalculatorUI.imprimirOpcionRadioDiametroCirculo();
                        aux = readerInt.nextInt();
                        if (aux != 1 && aux != 2) {
                            ShapeCalculatorUI.imprimirError();
                        }
                    } while (aux != 1 && aux != 2);
                    if (aux == 1) {
                        do {
                            ShapeCalculatorUI
                                    .imprimirNombreLadoIngresoEl("radio (r)");
                            radio = readerDouble.nextDouble();
                            if (radio <= 0) {
                                ShapeCalculatorUI.imprimirErrorDigitoMenorACero();
                            }
                        } while (radio <= 0);
                    }
                    if (aux == 2) {
                        do {
                            ShapeCalculatorUI
                                    .imprimirNombreLadoIngresoEl("diámetro (d)");
                            radio = (readerDouble.nextDouble() / 2);
                            if (radio <= 0) {
                                ShapeCalculatorUI.imprimirErrorDigitoMenorACero();
                            }
                        } while (radio <= 0);
                    }
                    Forma circulo = new Circulo(radio);
                    calcularCirculo(circulo);
                    ShapeCalculatorUI.printShapeAreaPerimeter(circulo);
                    break;
                case 8:
                    ShapeCalculatorUI.imprimirTituloCalculadoraSemicirculo();
                    do {
                        ShapeCalculatorUI.imprimirOpcionRadioDiametroCirculo();
                        aux = readerInt.nextInt();
                        if (aux != 1 && aux != 2) {
                            ShapeCalculatorUI.imprimirError();
                        }
                    } while (aux != 1 && aux != 2);
                    if (aux == 1) {
                        do {
                            ShapeCalculatorUI
                                    .imprimirNombreLadoIngresoEl("radio (r)");
                            radio = readerDouble.nextDouble();
                            if (radio <= 0) {
                                ShapeCalculatorUI.imprimirErrorDigitoMenorACero();
                            }
                        } while (radio <= 0);
                    }
                    if (aux == 2) {
                        do {
                            ShapeCalculatorUI
                                    .imprimirNombreLadoIngresoEl("diámetro (d)");
                            radio = (readerDouble.nextDouble() / 2);
                            if (radio <= 0) {
                                ShapeCalculatorUI.imprimirErrorDigitoMenorACero();
                            }
                        } while (radio <= 0);
                    }
                    Forma semicirculo = new Semicirculo(radio);
                    calcularSemicirculo(semicirculo);
                    ShapeCalculatorUI.printShapeAreaPerimeter(semicirculo);
                    break;
                case 0: // para que no me muestre metodo 'imprimirError'
                    break;
                default: // en caso de ingresar otro numero
                    ShapeCalculatorUI.imprimirError();
                    break;
            }
        } while (opcion != 0);// saca al usuario de la calculadora si ingresa 0
        ShapeCalculatorUI.imprimirDespedida(); // mensaje de terminacion del
        // programa
    }

    public static void calcularCuadrado(Forma cuadrado) { // para todos los
        // metodos se
        // ingresan
        // objetos de tipo
        // Forma
        Cuadrado temp = (Cuadrado) cuadrado; // casting al objeto que se
        // necesita
        double lado = temp.getLado1();
        cuadrado.setArea(Math.pow(lado, 2)); // calcula el area y se asigna
        // al
        // atributo área
        cuadrado.setPerimetro(lado * 4);// calcula el perimétro y se asigna
        // al
        // atributo perimétro
    }

    // los siguientes metodos tienen la misma estructura que el anterior
    public static void calcularRectangulo(Forma rectangulo) {
        Rectangulo temp = (Rectangulo) rectangulo;
        double base = temp.getLado1();
        double altura = temp.getLado2();
        rectangulo.setArea(base * altura);
        rectangulo.setPerimetro((2 * base) + (2 * altura));
    }

    public static void calcularTEquilatero(Forma triangulo) {
        Equilatero temp = (Equilatero) triangulo;
        double lado = temp.getLado1();
        double altura = Math.sqrt((lado * lado) - ((lado / 2) * (lado / 2))); // calculo
        // de
        // la
        // altura
        temp.setAltura(altura); // establece la altura calculada
        temp.setArea((lado * altura) / 2);
        temp.setPerimetro(lado * 3);
    }

    public static Forma retornarTrapecioIsosceles(double lado1, double lado2,
                                                  double lado3, double lado4) {
        double altura = Math.sqrt((lado1 * lado1)
                - (((lado3 - lado1) / 2) * (lado3 - lado1) / 2));// se calcula
        // la altura
        // del
        // trapecio
        // con base
        // a los
        // lados
        Forma trapecioIsosceles = new TrapecioIsosceles(lado1, lado2, lado3,
                lado4, altura);
        return trapecioIsosceles;
    }

    public static Forma retornarTrapecioIsosceles(double lado1, double lado3,
                                                  double altura) {
        double lado = Math.sqrt((altura * altura)
                + (((lado3 - lado1) / 2) * (lado3 - lado1) / 2));// se calcula
        // los lados
        // del
        // trapecio
        // con base
        // a la
        // altura
        Forma trapecioIsosceles = new TrapecioIsosceles(lado1, lado, lado3,
                lado, altura);
        return trapecioIsosceles;
    }

    public static void calcularTrapecioIsosceles(Forma trapecio) {
        TrapecioIsosceles temp = (TrapecioIsosceles) trapecio;
        double baseMayor = temp.getLado3();
        double baseMenor = temp.getLado1();
        double lado = temp.getLado2();
        double altura = temp.getAltura();
        temp.setArea((((baseMayor + baseMenor) * altura) / 2));
        temp.setPerimetro(lado + lado + baseMayor + baseMenor);
    }

    public static Forma retornarTrapecioRectangulo(double lado1, double lado3,
                                                   double lado4, double altura) {
        double lado2 = Math.sqrt((Math.pow(lado3 - lado1, 2))
                + (Math.pow(altura, 2)));// se calcula el lado del trapecio
        // con base a la altura
        Forma trapecioRectangulo = new TrapecioRectangulo(lado1, lado2, lado3,
                lado4, altura);
        return trapecioRectangulo;
    }

    public static void calcularTrapecioRectangulo(Forma trapecio) {
        TrapecioRectangulo temp = (TrapecioRectangulo) trapecio;
        double baseMayor = temp.getLado3();
        double baseMenor = temp.getLado1();
        double altura = temp.getAltura();
        double lado2 = temp.getLado2();
        double lado4 = temp.getLado4();
        temp.setArea((((baseMayor + baseMenor) * altura) / 2));
        temp.setPerimetro(baseMayor + baseMenor + lado4 + lado2);
    }

    public static Forma retornarTrianguloIsosceles(double lados, double base,
                                                   double altura) {
        altura = Math.sqrt((lados * lados) - ((base / 2) * (base / 2)));
        Forma tIsosceles = new Isosceles(lados, base, altura);
        return tIsosceles;
    }

    public static Forma retornarTrianguloIsosceles(double base, double altura) {
        double lados = Math.sqrt(((base / 2) * (base / 2)) + (altura * altura));
        Forma tIsosceles = new Isosceles(lados, base, altura);
        return tIsosceles;
    }

    public static void calcularIsosceles(Forma tIsosceles) {
        Isosceles temp = (Isosceles) tIsosceles;
        double base = temp.getLado3();
        double altura = temp.getAltura();
        double lados = temp.getLado1();
        temp.setArea(((base * altura) / 2));
        temp.setPerimetro(2 * lados + base);
    }

    public static void calcularEscaleno(Forma tEscaleno) {
        Escaleno temp = (Escaleno) tEscaleno;
        double lado1 = temp.getLado1();
        double lado2 = temp.getLado2();
        double lado3 = temp.getLado3();
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        temp.setArea(Math.sqrt(semiperimetro * (semiperimetro - lado1)
                * (semiperimetro - lado2) * (semiperimetro - lado3)));
        temp.setPerimetro(lado1 + lado2 + lado3);
    }

    public static void calcularCirculo(Forma circulo) {
        Circulo temp = (Circulo) circulo;
        double radio = temp.getRadio();
        temp.setArea(Math.PI * (radio * radio));
        temp.setPerimetro(Math.PI * 2 * radio);
    }

    public static void calcularSemicirculo(Forma semicirculo) {
        Semicirculo temp = (Semicirculo) semicirculo;
        double radio = temp.getRadio();
        temp.setArea((Math.PI * (radio * radio)) / 2);
        temp.setPerimetro((Math.PI * 2 * radio) / 2);
    }
}

