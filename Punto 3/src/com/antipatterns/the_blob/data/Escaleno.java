package com.antipatterns.the_blob.data;

public class Escaleno extends Triangulo {

	public Escaleno(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
	}
	
	@Override
	public String toString() {
		String str = "";
		str += ("â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”�\n");
		str += String.format("â”‚ INFORMACIÃ“N TRIÃ�NGULO ESCALENO %17s", "â”‚");
		str += String.format("\nâ”‚\tLado 1: %.2f%29s",
				this.lado1, "â”‚");
		str += String.format("\nâ”‚\tLado 2: %.2f%29s",
				this.lado2, "â”‚");
		str += String.format("\nâ”‚\tLado 3: %.2f%29s",
				this.lado3, "â”‚");
		str += super.toString();
		return str;
	}
}
