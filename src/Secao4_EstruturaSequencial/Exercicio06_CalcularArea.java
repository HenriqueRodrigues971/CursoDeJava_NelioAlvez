package Secao4_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio06_CalcularArea {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	double a,b,c, triangulo, circulo, trapezio, quadrado, retangulo;
   a = sc.nextDouble();
   b = sc.nextDouble();
   c = sc.nextDouble();
	triangulo = (a * c) / 2.0;
	circulo = Math.PI * c * c;
	trapezio = (a+b) / 2.0 * c;
	quadrado = b * b;
	retangulo = a * b;
	
	System.out.println("a) Area do trinagulo retangulo que tem a por base e c por altura:");
	System.out.printf("Triangulo: %.3f\n", triangulo);
	
	System.out.println("\nb) Area do circulo de raio c:");
	System.out.printf("Circulo: %.3f\n", circulo);
    
	System.out.println("\nc) Área do trapézio que tem a e b como base e c por altura: ");
    System.out.printf("Trapezio: %.3f\n", trapezio);
    
    System.out.println("\nd) Área do quadrado que tem lado b");
    System.out.printf("Quadrado: %.3f\n", quadrado);
    
    System.out.println("\ne) Área do retângulo que tem lados A e B: ");
    System.out.printf("Retangulo: %.3f", retangulo);
	sc.close();
 }
}
