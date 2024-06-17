package Secao10_Memorias_Arrays;

public class Funcionario {
	int id;
	String nome;
	double salario;

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public void aumentoSalario(double porcentoAumentado) {
		salario += salario * (porcentoAumentado / 100.0);
	}

	@Override
	public String toString() {
		return  id + ", " + nome + ", " + String.format("%.2f", salario) ;
	}
	
	
}
