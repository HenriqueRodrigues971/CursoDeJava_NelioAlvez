package Secao17_Arquivos.FileWriterBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite_BufferedWriter {
	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good nigth" };
		String path = "/home/henrique/test";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
