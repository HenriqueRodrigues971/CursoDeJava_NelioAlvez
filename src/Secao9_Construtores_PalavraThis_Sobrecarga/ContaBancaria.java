package Secao9_Construtores_PalavraThis_Sobrecarga;

public class ContaBancaria {
	private int conta;
	private String titular;
	private double saldo;

	public String getNomeTitular() {
		return titular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.titular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getConta() {
		return conta;
	}

	public ContaBancaria() {
	}

	public ContaBancaria(int conta, String titular, double saldo) {
		this.conta = conta;
		this.setNomeTitular(titular);
		this.saldo = saldo;
	}

	public ContaBancaria(int conta, String titular) {
		this.conta = conta;
		this.setNomeTitular(titular);
	}

	public void depositoConta(double valorDepositado) {
		this.saldo += valorDepositado;
	}

	public void saqueConta(double valorSaque) {
		this.saldo -= (valorSaque + 5.00);
	}

	public void atualizarNome(String nomeNovo) {
		this.setNomeTitular(nomeNovo);
	}

	@Override
	public String toString() {
		return "Titular da conta: " + this.titular + ", Conta: " + this.conta
				+ String.format(", Valor em conta: %.2f", this.saldo);
	}
}
