package Secao4_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio04_SalarioFuncionario {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numeroFuncionario,horasTabalhadas;
	double  valorHora, salario;
	numeroFuncionario = sc.nextInt();
	horasTabalhadas = sc.nextInt();
	valorHora = sc.nextDouble();
	
	salario = horasTabalhadas * valorHora;
	System.out.printf("Number: %d\n", numeroFuncionario);
	System.out.printf("Salario: R$ %.2f",salario);
	sc.close();
}
}
