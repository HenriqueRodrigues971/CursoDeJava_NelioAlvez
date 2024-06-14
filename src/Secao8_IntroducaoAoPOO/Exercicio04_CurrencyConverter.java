package Secao8_IntroducaoAoPOO;

public class Exercicio04_CurrencyConverter {
 double dollarPrice, buyDollars;
 public double Converter() {
	 return (dollarPrice * buyDollars) * 1.06 ;
 }
 
@Override
public String toString() {
	return "Amount to be paid in reais  = " + String.format("%.2f", Converter());
}
 
}
