package Secao17_Arquivos.Exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao {
	public static void main(String[] args) throws ParseException {

		// Define o local padrão como EUA para formatação de números
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Digite o caminho do arquivo: ");
		String sourceFileStr = sc.nextLine();

		// Cria um objeto File a partir do caminho fornecido
		File sourceFile = new File(sourceFileStr);
		// Obtém o diretório pai do arquivo fornecido
		String sourceFolderStr = sourceFile.getParent();

		// Cria um diretório chamado "out" no mesmo diretório do arquivo fornecido
		boolean success = new File(sourceFolderStr + "/out").mkdir();

		// Define o caminho do arquivo de destino como "out/summary.csv" no diretório
		// pai
		String targetFileStr = sourceFolderStr + "/out/summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String itemCsv = br.readLine();
			while (itemCsv != null) {

				// Divide a linha lida em campos separados por vírgula
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				// Adiciona um novo produto à lista
				list.add(new Product(name, price, quantity));

				itemCsv = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Product item : list) {
					// Escreve o nome do produto e o valor total (preço * quantidade) no arquivo de
					// destino
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CRIADO!");

			} catch (IOException e) {
				System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}

		sc.close();
	}
}
