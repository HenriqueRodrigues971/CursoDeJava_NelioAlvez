package Secao5_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio01_If_Else {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	int num = sc.nextInt();
	
	if(num < 0) {
		System.out.println("Negativo");
	}else {
		System.out.println("não negativo");
	}
	sc.close();
}
}
