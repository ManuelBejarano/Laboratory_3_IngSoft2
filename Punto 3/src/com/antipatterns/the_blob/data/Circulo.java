package com.antipatterns.the_blob.data;

public class Circulo extends Forma {
	protected double radio;

	public Circulo(double radio) {
		super(0, 0);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += ("\n \tEs una figura Circular\n");
		str += String.format("â”‚ INFORMACIÃ“N CÃ�RCULO %28s", "â”‚");
		str += String.format("\nâ”‚\tRadio: %.2f%30s",
				this.radio, "â”‚");
		str += super.toString();
		return str;
	}
}
