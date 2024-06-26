package Secao14_HerancaPolimorfismo.ExercicioFixacao.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date date;

	public UsedProduct() {
	}

	public UsedProduct(String name, double price, Date date) {
		super(name, price);
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String priceTag() {
		return String.format("%s  (used) $ %.2f (Manufacture date: " + sdf.format(date)+")", super.getName(),
				super.getPrice());
	}

}
