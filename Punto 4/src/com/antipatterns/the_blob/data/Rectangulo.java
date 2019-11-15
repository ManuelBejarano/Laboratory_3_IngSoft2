package com.antipatterns.the_blob.data;

public class Rectangulo extends Cuadrilatero{
	
	public Rectangulo (double base, double altura){
		super (base, altura, base, altura);
	}
	
	@Override
	public String toString() {
		String str = "";
		str += ("â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”�\n");
		str += String.format("â”‚ INFORMACIÃ“N RECTÃ�NGULO %25s", "â”‚");
		str += String.format("\nâ”‚\tBase: %.2f%31s",
				this.lado1, "â”‚");
		str += String.format("\nâ”‚\tAltura: %.2f%29s",
				this.lado2, "â”‚");
		str += super.toString();
		return str;
	}

}
