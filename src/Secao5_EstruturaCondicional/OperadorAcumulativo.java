package Secao5_EstruturaCondicional;

public class OperadorAcumulativo {
public static void main(String[] args) {
	int minutos = 220;
	double conta = 50.0;
	
	if(minutos > 100) {
		conta += (minutos - 100) * 2.0;
	}
	System.out.println("Valor da conta = R$ " + conta);
}
 }
