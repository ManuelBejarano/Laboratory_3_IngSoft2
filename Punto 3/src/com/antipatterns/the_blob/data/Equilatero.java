package com.antipatterns.the_blob.data;

public class Equilatero extends Triangulo {

	public Equilatero(double lado) {
		super(lado, lado, lado);
	}
	
	@Override
	public String toString() {
		String str = "";
		str += ("â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”�\n");
		str += String.format("â”‚ INFORMACIÃ“N TRIÃ�NGULO EQUILÃ�TERO %15s", "â”‚");
		str += String.format("\nâ”‚\tLado: %.2f%31s",
				this.lado1, "â”‚");
		str += super.toString();
		return str;
	}
}
