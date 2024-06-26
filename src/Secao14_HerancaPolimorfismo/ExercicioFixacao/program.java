package Secao14_HerancaPolimorfismo.ExercicioFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Secao14_HerancaPolimorfismo.ExercicioFixacao.entities.ImportedProduct;
import Secao14_HerancaPolimorfismo.ExercicioFixacao.entities.Product;
import Secao14_HerancaPolimorfismo.ExercicioFixacao.entities.UsedProduct;

public class program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		List<Product> product = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Dar entrada em quantos produtos?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Comum, importado ou usado(c/u/i)?");
			char ch = sc.next().charAt(0);

			System.out.println("Produto #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();
				product.add(new ImportedProduct(name, price, customFee));
			} else if (ch == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				product.add(new UsedProduct(name, price, date));
			} else {
				product.add(new Product(name, price));
			}
		}
		System.out.println("PRICE TAGS: ");
		for (Product c : product) {
			System.out.println(c.priceTag());
		}
		sc.close();
	}
}
