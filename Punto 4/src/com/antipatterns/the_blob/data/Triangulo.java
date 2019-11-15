package com.antipatterns.the_blob.data;

public abstract class Triangulo extends Forma{
	
	protected double lado1;
	protected double lado2;
	protected double lado3;
	protected double altura;
	
	public Triangulo (double lado1, double lado2, double lado3){
		super(0,0); // uso del constructor de Forma
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
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
		str += String.format("\n│\tEs una figura triangular. %16s", "│");		
		str += super.toString();
		return str;
	}
}
