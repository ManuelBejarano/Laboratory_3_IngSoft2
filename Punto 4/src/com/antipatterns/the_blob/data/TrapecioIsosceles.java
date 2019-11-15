package com.antipatterns.the_blob.data;

public class TrapecioIsosceles extends Trapecio {

	public TrapecioIsosceles(double lado1, double lado2, double lado3,
			double lado4, double altura) {
		super(lado1, lado2, lado3, lado4, altura);
	}
	
	@Override
	public String toString() {
		String str = "";
		str += ("â”Œâ”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”€â”�\n");
		str += String.format("â”‚ INFORMACIÃ“N TRAPECIO ISÃ“SCELES %17s", "â”‚");
		str += String.format("\nâ”‚\tBase Mayor: %.2f%25s",
				this.lado3, "â”‚");
		str += String.format("\nâ”‚\tBase menor: %.2f%25s",
				this.lado1, "â”‚");
		str += String.format("\nâ”‚\tLados: %.2f%30s",
				this.lado2, "â”‚");
		str += String.format("\nâ”‚\tAltura: %.2f%29s",
				this.altura, "â”‚");
		str += super.toString();
		return str;
	}

}
