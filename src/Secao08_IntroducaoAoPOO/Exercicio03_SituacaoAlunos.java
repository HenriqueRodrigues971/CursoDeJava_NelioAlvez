package Secao08_IntroducaoAoPOO;

import java.util.Scanner;

public class Exercicio03_SituacaoAlunos {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Exercicio03_Student s = new Exercicio03_Student();
	
	System.out.println("Aluno: ");
	s.name = sc.nextLine();
	System.out.println("Insira a Nota1, Nota2 e Nota3");
	s.n1 = sc.nextDouble();
	s.n2 = sc.nextDouble();
	s.n3 = sc.nextDouble();
	
	s.notasAlunos(s.n1, s.n2, s.n3);
	sc.close();
}
}
