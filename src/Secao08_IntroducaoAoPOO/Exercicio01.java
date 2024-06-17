package Secao08_IntroducaoAoPOO;

import java.util.Scanner;

public class Exercicio01 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Exercicio01_triangle t = new Exercicio01_triangle();
	System.out.println("Enter rectangle width and height:");
    t.setWidth(sc.nextDouble());
    t.setHeight(sc.nextDouble());
    System.out.println("Área: " + t.Area());
    System.out.println("Perimetro: " + t.Perimetro());
    System.out.println("Diagonal: "+t.diagonal());
    sc.close();
}
}
