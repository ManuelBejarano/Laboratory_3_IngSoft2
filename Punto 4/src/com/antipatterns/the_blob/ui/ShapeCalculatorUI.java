package com.antipatterns.the_blob.ui;

import com.antipatterns.the_blob.business.*;
import com.antipatterns.the_blob.data.*;

public class ShapeCalculatorUI {

	public static void printShapeAreaPerimeter(Forma figura) {
		System.out.println(figura);
	}
	
	

	public static void imprimirError() {
		System.out.println("NÃƒÂºmero no vÃƒÂ¡lido, verifique e intente de nuevo");
	}

	public static void imprimirErrorDigitoMenorACero() {
		System.out.println("Los valores deben ser mayores que 0.");
	}

	public static void imprimirErrorBaseTrapecio() {
		System.out.println("AsegÃƒÂºrese que la Base mayor sea mayor a la menor.");
	}

	public static void imprimirErrorTriangulo() {
		System.out
				.println("No se puede calcular. Verifique el tamaÃƒÂ±o de los lados.");
	}

	public static void imprimirPantallaInicio() {
		String str = "";
		str = "\t\tCALCULADORA DE Ãƒï¿½REAS Y PERÃƒï¿½METROS - POO";
		str += "\n\nEn este programa usted podrÃƒÂ¡ calcular el ÃƒÂ¡rea y el perÃƒÂ­metro de:\n";
		str += "Cuadrados, triÃƒÂ¡ngulos, cÃƒÂ­rculos, semicÃƒÂ­rculos, rectÃƒÂ¡ngulos y trapezoides\n\n";
		System.out.println(str);
	}

	public static void imprimirMenuPrincipal() {
		String str = "";
		str += "Ingrese el nÃƒÂºmero de la opciÃƒÂ³n a escoger: \n";
		str += "    1. Cuadrado\n";
		str += "    2. RectÃƒÂ¡ngulo\n";
		str += "    3. Trapecio\n";
		str += "    4. TriÃƒÂ¡ngulo EquilÃƒÂ¡tero\n";
		str += "    5. TriÃƒÂ¡ngulo IsÃƒÂ³sceles\n";
		str += "    6. TriÃƒÂ¡ngulo Escaleno\n";
		str += "    7. CÃƒÂ­rculo\n";
		str += "    8. SemicÃƒÂ­rculo\n";
		str += "    0. Si desea salir del programa\n";
		str += "OpciÃƒÂ³n: ";
		System.out.print(str);
	}

	public static void imprimirMenuTrapecio() {
		String str = "";
		str += "\t\tCalculadora de Trapecios\n";
		str += "Ingrese el nÃƒÂºmero de la opciÃƒÂ³n a escoger: \n";
		str += "    1. Trapecio IsÃƒÂ³sceles\n";
		str += "    2. Trapecio RectÃƒÂ¡ngulo\n";
		str += "    0. Si desea regresar al menÃƒÂº anterior\n";
		str += "OpciÃƒÂ³n: ";
		System.out.print(str);
	}

	public static void imprimirOpcionAlturaLadosTrapecioIsosceles() {
		System.out
				.print("Si conoce los lados (L), ingrese 1. Si conoce la altura (h), ingrese 2: ");
	}

	public static void imprimirOpcionAlturaLadosTrapecioRectangulo() {
		System.out
				.print("Si conoce todos los lados (h, L), ingrese 1. Si conoce solo la altura (h), ingrese 2: ");
	}
	
	public static void imprimirOpcionRadioDiametroCirculo(){
		System.out.println("Si conoce el radio (r), ingrese 1. Si conoce el diÃƒÂ¡metro (d), ingrese 2.");
	}

	public static void imprimirTituloCalculadoraCuadrado() {
		String str="";
		str+=("\t\tCalculadora de Cuadrados\n");
		str+=("Ã¢â€�Å’Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�ï¿½\n");
		str+=("Ã¢â€�â€š       Ã¢â€�â€š\n");
		str+=("Ã¢â€�â€š       Ã¢â€�â€šL\n");
		str+=("Ã¢â€�â€š       Ã¢â€�â€š\n");
		str+=("Ã¢â€�â€�Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�Ëœ");
		System.out.println(str);
	}

	public static void imprimirTituloCalculadoraRectangulo() {
		String str="";
		str+=("\t\tCalculadora de RectÃƒÂ¡ngulos\n");
		str+=("Ã¢â€�Å’Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�ï¿½\n");
		str+=("Ã¢â€�â€š                Ã¢â€�â€š\n");
		str+=("Ã¢â€�â€š                Ã¢â€�â€šaltura\n");
		str+=("Ã¢â€�â€š                Ã¢â€�â€š\n");
		str+=("Ã¢â€�â€�Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�â‚¬Ã¢â€�Ëœ\n");
		str+=("       base \n");
		System.out.println(str);
	}

	public static void imprimirTituloCalculadoraTrapecioIsosceles() {
		System.out.println("\t\tCalculadora de Trapecio Isosceles");
		char triangulo[][] = new char[6][11];
		triangulo[1][3] = '|';
		triangulo[1][4] = '?';
		triangulo[1][5] = '_';
		triangulo[1][6] = '_';
		triangulo[2][3] = '|';
		triangulo[2][7] = '\\';
		triangulo[3][3] = '|';
		triangulo[3][4] = 'h';
		triangulo[3][3] = '|';
		triangulo[3][8] = '\\';
		triangulo[3][10] = 'L';
		triangulo[4][3] = '|';
		triangulo[4][4] = '_';
		triangulo[4][5] = '9';
		triangulo[4][6] = '7';
		triangulo[4][7] = '4';
		triangulo[4][8] = '6';
		triangulo[4][9] = '/';
		triangulo[5][5] = '*';
		triangulo[5][6] = '-';

		for (int i = 0; i < triangulo.length; i++) {
			for (int j = 0; j < triangulo[i].length; j++) {
				System.out.print(triangulo[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void imprimirTituloCalculadoraTrapecioRectangulo() {
		System.out.println("\t\tCalculadora de Trapecio RectÃƒÂ¡ngulo");
		char triangulo[][] = new char[6][11];
		triangulo[1][3] = '|';
		triangulo[1][4] = '?';
		triangulo[1][5] = '_';
		triangulo[1][6] = '_';
		triangulo[2][3] = '|';
		triangulo[2][7] = '\\';
		triangulo[3][3] = '|';
		triangulo[3][4] = 'h';
		triangulo[3][3] = '|';
		triangulo[3][8] = '\\';
		triangulo[3][10] = 'L';
		triangulo[4][3] = '|';
		triangulo[4][4] = '_';
		triangulo[4][5] = '9';
		triangulo[4][6] = '7';
		triangulo[4][7] = '4';
		triangulo[4][8] = '6';
		triangulo[4][9] = '/';
		triangulo[5][5] = '*';
		triangulo[5][6] = '-';

		for (int i = 0; i < triangulo.length; i++) {
			for (int j = 0; j < triangulo[i].length; j++) {
				System.out.print(triangulo[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void imprimirTituloCalculadoraTrianguloEquilatero() {
		System.out.println("\t\tCalculadora de TriÃƒÂ¡ngulo EquilÃƒÂ¡tero\n");
		char triangulo[][] = new char[3][7];
		triangulo[0][2] = '/';
		triangulo[0][3] = '\\';
		triangulo[1][1] = '/';
		triangulo[1][4] = '\\';
		triangulo[1][6] = 'L';
		triangulo[2][0] = '/';
		triangulo[2][1] = '_';
		triangulo[2][2] = '_';
		triangulo[2][3] = '_';
		triangulo[2][4] = '_';
		triangulo[2][5] = '\\';

		for (int i = 0; i < triangulo.length; i++) {
			for (int j = 0; j < triangulo[i].length; j++) {
				System.out.print(triangulo[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void imprimirTituloCalculadoraTrianguloIsosceles() {
		System.out.println("\t\tCalculadora de TriÃƒÂ¡ngulo IsÃƒÂ³sceles\n");
		char triangulo[][] = new char[5][8];
		triangulo[0][3] = '/';
		triangulo[0][4] = '|';
		triangulo[0][4] = '\\';
		triangulo[1][1] = 'L';
		triangulo[1][2] = '/';
		triangulo[1][4] = '|';
		triangulo[1][5] = '\\';
		triangulo[1][7] = 'L';
		triangulo[2][1] = '/';
		triangulo[2][4] = '|';
		triangulo[2][3] = 'h';
		triangulo[2][6] = '\\';
		triangulo[3][0] = '/';
		triangulo[3][1] = '_';
		triangulo[3][2] = '_';
		triangulo[3][3] = '_';
		triangulo[3][4] = '|';
		triangulo[3][5] = '_';
		triangulo[3][6] = '_';
		triangulo[3][7] = '\\';
		triangulo[4][7] = 'b';

		for (int i = 0; i < triangulo.length; i++) {
			for (int j = 0; j < triangulo[i].length; j++) {
				System.out.print(triangulo[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void imprimirTituloCalculadoraTrianguloEscaleno() {
		System.out.println("\t\tCalculadora de TriÃƒÂ¡ngulo Escaleno\n");
		char triangulo[][] = new char[4][10];
		triangulo[0][4] = '/';
		triangulo[0][5] = '\\';
		triangulo[1][0] = 'L';
		triangulo[1][1] = '1';
		triangulo[1][3] = '/';
		triangulo[1][6] = '\\';
		triangulo[1][8] = 'L';
		triangulo[1][9] = '2';
		triangulo[2][2] = '/';
		triangulo[2][3] = '_';
		triangulo[2][4] = '_';
		triangulo[2][5] = '_';
		triangulo[2][6] = '_';
		triangulo[2][7] = '\\';
		triangulo[3][4] = 'L';
		triangulo[3][5] = '3';

		for (int i = 0; i < triangulo.length; i++) {
			for (int j = 0; j < triangulo[i].length; j++) {
				System.out.print(triangulo[i][j]);
			}
			System.out.println();
		}
		System.out.println("(recuerde que en este triÃƒÂ¡ngulo todos sus lados son diferentes)");
		System.out.println();
	}
	
	public static void imprimirTituloCalculadoraCirculo() {
		System.out.println("\t\tCalculadora de CÃƒÂ­rculo\n");
		char circulo[][] = new char[3][9];
		
		circulo[0][0]='|';
		circulo[0][1]='-';
		circulo[0][2]='-';
		circulo[0][3]='-';
		circulo[0][4]='d';
		circulo[0][5]='-';
		circulo[0][6]='-';
		circulo[0][7]='-';
		circulo[0][8]='|';
		circulo[1][0]='(';
		circulo[1][1]=')';
		circulo[1][2]='*';
		circulo[1][3]='[';
		circulo[1][4]='P';
		circulo[1][5]='_';
		circulo[1][6]=':';
		circulo[1][7]=';';
		circulo[1][8]=',';
		circulo[2][0]='-';
		circulo[2][1]='|';
		circulo[2][2]='@';
		circulo[2][3]='!';
		circulo[2][4]='>';
		
		for (int i = 0; i < circulo.length; i++) {
			for (int j = 0; j < circulo[i].length; j++) {
				System.out.print(circulo[i][j]);
			}
			System.out.println();
		}
		System.out.println("(d: diÃƒÂ¡metro, r: radio)");
		System.out.println();
	}
	
	public static void imprimirTituloCalculadoraSemicirculo() {
		System.out.println("\t\tCalculadora de SemicÃƒÂ­rculo\n");
		char circulo[][] = new char[3][9];

		circulo[0][0]='|';
		circulo[0][1]='-';
		circulo[0][2]='-';
		circulo[0][3]='-';
		circulo[0][4]='d';
		circulo[0][5]='-';
		circulo[0][6]='-';
		circulo[0][7]='-';
		circulo[0][8]='|';
		circulo[1][0]='(';
		circulo[1][1]=')';
		circulo[1][2]='*';
		circulo[1][3]='[';
		circulo[1][4]='P';
		circulo[1][5]='_';
		circulo[1][6]=':';
		circulo[1][7]=';';
		circulo[1][8]=',';
		circulo[2][0]='-';
		circulo[2][1]='|';
		circulo[2][2]='@';
		circulo[2][3]='!';
		circulo[2][4]='>';
		
		for (int i = 0; i < circulo.length; i++) {
			for (int j = 0; j < circulo[i].length; j++) {
				System.out.print(circulo[i][j]);
			}
			System.out.println();
		}
		System.out.println("(d: diÃƒÂ¡metro, r: radio)\nRecuerde que un semicÃƒÂ­rculo es la mitad de in cÃƒÂ­rculo.");
		System.out.println();
	}

	public static void imprimirNombreLadoIngresoLa(String nombreLado) {
		System.out.print("Ingrese la " + nombreLado + ": ");
	}

	public static void imprimirNombreLadoIngresoEl(String nombreLado) {
		System.out.print("Ingrese el " + nombreLado + ": ");
	}

	public static void imprimirIngresoUnicoLado() {
		System.out.print("Ingrese el lado (L): ");
	}

	public static void imprimirDespedida() {
		System.out
				.println("La calculadora de ÃƒÂ¡reas y perÃƒÂ­metros ha sido ceerrada.");
	}
}
