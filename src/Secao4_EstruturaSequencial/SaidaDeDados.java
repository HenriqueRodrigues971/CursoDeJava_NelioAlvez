package Secao4_EstruturaSequencial;

public class SaidaDeDados {
	public static void main(String[] args) {
    double x = 10.35784;
    System.out.print(x+"\n");
    System.out.printf("%.3f\n", x); // %.2f delimita a qtd de casas decimais
	System.out.println("Resultado= "+ x + " Metros");
	System.out.printf("Resultado= %.2f Metros%n",x);
	
	/*
	 *  %f = ponto flutuante
	 *  %d = inteiro
	 *  %s = texto
	 *  %n = quebra de linha*/
	
	String nome = "Maria";
	int idade = 31;
	double renda = 4000.0D;
	System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);
	
	}
}
