package com.antipatterns.the_blob.data;

public abstract class Forma {
	protected double area;
	protected double perimetro;

	public Forma(double area, double perimetro) {
		this.area = area;
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	@Override
	public String toString() {
		String str = "";
		str += ("\n├────────────────────────────────────────────────┤\n");
		str += String.format("│ RESULTADOS: %36s", "│");
		str += String.format("\n│\tEl perímetro de la figura es: %.2f%7s",
				this.perimetro, "│");
		str += String.format("\n│\tEl área de la figura es: %.2f%12s\n",
				this.area, "│");
		str += ("└────────────────────────────────────────────────┘");
		return str;
	}
}
