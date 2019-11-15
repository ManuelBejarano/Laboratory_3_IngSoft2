package com.antipatterns.the_blob.data;

public abstract class Trapecio extends Cuadrilatero {

	protected double altura;

	public Trapecio(double lado1, double lado2, double lado3, double lado4,
			double altura) {
		super(lado1, lado2, lado3, lado4);
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		String str = "";
		str += super.toString();
		return str;
	}
}
