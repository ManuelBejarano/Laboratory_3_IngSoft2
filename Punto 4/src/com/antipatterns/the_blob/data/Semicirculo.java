package com.antipatterns.the_blob.data;

public class Semicirculo extends Circulo {

	public Semicirculo(double radio) {
		super(radio);
	}
	
	@Override
	public String toString() {
		String str = "";
		str += ("â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”�\n");
		str += String.format("â”‚ INFORMACIÃ“N SEMICÃ�RCULO %24s", "â”‚");
		str += super.toString();
		return str;
	}
}
