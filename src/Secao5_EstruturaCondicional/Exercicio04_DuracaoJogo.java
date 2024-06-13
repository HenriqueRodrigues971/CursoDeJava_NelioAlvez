package Secao5_EstruturaCondicional;

import java.util.Scanner;

public class Exercicio04_DuracaoJogo {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int hi, hf,durou, hd=24;
	
	hi = sc.nextInt();
	hf = sc.nextInt();
	
	if(hi > hf) {
		durou = (hd - hi) + hf;
		System.out.println("O jogo durou "+durou+" Horas");
	}else if( hi < hf) {
		durou = hf - hi;
		System.out.println("O jogo durou "+durou+" Horas");
	}else if( hi == hf) {
		System.out.println("O jogo durou "+hd+" Horas");
	}
}
}
