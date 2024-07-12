package Secao18_Interfaces.ExercicioFixacao.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private int contractNumber;
	private LocalDate date;
	private double contractValue;
	private List<Installment> isntallments = new ArrayList<>();

	public Contract() {
	}

	public Contract(int contractNumber, LocalDate date, double contractValue) {
		this.contractNumber = contractNumber;
		this.date = date;
		this.contractValue = contractValue;
	}

	public int getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(int contractNumber) {
		this.contractNumber = contractNumber;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getContractValue() {
		return contractValue;
	}

	public void setContractValue(double contractValue) {
		this.contractValue = contractValue;
	}

	public List<Installment> getIsntallments() {
		return isntallments;
	}

}
