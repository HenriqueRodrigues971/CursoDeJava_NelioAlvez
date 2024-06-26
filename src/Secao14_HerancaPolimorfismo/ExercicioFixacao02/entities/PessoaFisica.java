package Secao14_HerancaPolimorfismo.ExercicioFixacao02.entities;

public class PessoaFisica extends Pessoa {
	private double gastosSaude;

	public PessoaFisica() {
	}

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calcularImposto() {
		double imposto;
		if (getRendaAnual() >= 20000.00) {
			if (getGastosSaude() > 0) {
				imposto = getRendaAnual() * 0.25 - (getGastosSaude() / 2);
			} else {
				imposto = getRendaAnual() * 0.25;
			}
		} else {
			if (getGastosSaude() > 0) {
				imposto = getRendaAnual() * 0.15 - (getGastosSaude() / 2);
			} else {
				imposto = getRendaAnual() * 0.15;
			}
		}
		return imposto;
	}

}
