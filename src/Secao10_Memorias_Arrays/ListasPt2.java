package Secao10_Memorias_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListasPt2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "marco");
		System.out.println(list.size());

		// list.remove("Anna");
		// list.remove(1);

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------");
		/* Removendo pela letra especifica */
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------");
		System.out.println("index of bob: " + list.indexOf("Bob"));

		/* Filtra a lista pela inicial */
		System.out.println("------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		/*
		 * Retorna o primeiro elemento da lista de acordo com letra, se não tiver nenhum
		 * vem null
		 */
		System.out.println("----------");
		String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(name);
	}
}
