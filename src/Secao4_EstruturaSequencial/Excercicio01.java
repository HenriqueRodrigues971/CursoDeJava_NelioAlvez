package Secao4_EstruturaSequencial;

import java.util.Scanner;

public class Excercicio01 {
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	int num1,num2,total;
	 System.out.println("Digite o primeiro valor: ");
	num1 = scan.nextInt();
	System.out.println("Digite o segundo valor: ");
	num2 = scan.nextInt();
	
	total = num1 + num2;
	
	System.out.println("Soma: " +total);
}
}
