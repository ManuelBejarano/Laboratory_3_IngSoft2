package com.antipatterns.the_blob.data;

public class Isosceles extends Triangulo {

	public Isosceles(double lados, double base, double altura) {
		super(lados, lados, base);
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += ("â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”�\n");
		str += String.format("â”‚ INFORMACIÃ“N TRIÃ�NGULO ISÃ“SCELES %16s", "â”‚");
		str += String.format("\nâ”‚\tLados: %.2f%30s",
				this.lado1, "â”‚");
		str += String.format("\nâ”‚\tBase: %.2f%31s",
				this.lado3, "â”‚");
		str += String.format("\nâ”‚\tAltura: %.2f%29s",
				this.altura, "â”‚");
		str += super.toString();
		return str;
	}
}
