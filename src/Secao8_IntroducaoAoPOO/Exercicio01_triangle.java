package Secao8_IntroducaoAoPOO;

public class Exercicio01_triangle {
	double width;
	double height;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double Area() {
		return width * height;
	}

	public double Perimetro() {
		return 2 * (width + height);
	}
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
