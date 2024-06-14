package Secao8_IntroducaoAoPOO;

import java.util.Scanner;

public class Exercicio02_ImpostoFuncionario {
 public static void main(String[] args) {
	Exercicio02_Funcionario f = new Exercicio02_Funcionario();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Name: ");
	f.name = sc.nextLine();
	System.out.println("Gross salary: ");
	f.grossSalary = sc.nextDouble();
	System.out.println("Tax: ");
	f.tax = sc.nextDouble();
	
	System.out.println("Employee: "+ f);
	System.out.println("Which percentage to increase salary? ");
	f.increaseSalary(sc.nextDouble());
	System.out.println("Update data: "+ f);
sc.close();
 }
}
