package Secao15_ExercicioFixacao.entities;

public class Account {
	private Integer number;
	private String holder;
	private double balance;
	private double withDrawLimit;

	public Account() {
	}

	public Account(Integer number, String holder, double balance, double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withDraw(double amount) {
		if (amount > withDrawLimit) {
			throw new IllegalArgumentException("O valor de sarque não pode ser maior que o limite de saque");
		} else if (amount > balance) {
			throw new IllegalArgumentException("Valor em conta insuficiente");
		}

		else {
			balance -= amount;
		}
	}

	@Override
	public String toString() {
		return "Saldo atual: " + String.format("%.2f", balance);
	}
}
