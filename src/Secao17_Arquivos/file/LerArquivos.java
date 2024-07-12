package Secao17_Arquivos.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivos {
	public static void main(String[] args) {
		File file = new File("/home/henrique/NomesEmpresa");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) { // hasNextLine = se tiver uma proxima linha no arquivo ele imprime
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
