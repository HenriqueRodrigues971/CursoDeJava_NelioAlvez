package Secao20_ProgramacaoFuncional_ExpressoesIrregulares.ExercicioFixacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "/home/henrique/eclipse-workspace/CursoDeJava_NelioAlvez/src/Secao20_ProgramacaoFuncional_ExpressoesIrregulares/ExercicioFixacao/in.txt";

        System.out.println("Digite um valor e será mostrado os Salarios maiores que tal: ");
        double salaryMin = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0].trim(), fields[1].trim(), Double.parseDouble(fields[2].trim())));
                line = br.readLine();
            }
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            System.out.println("Emails dos funcionarios que recebem mais que " + salaryMin);
            List<String> listEmail = list.stream().filter(p -> p.getSalary() > salaryMin).map(p -> p.getEmail()).sorted(comp).collect(Collectors.toList());
            listEmail.forEach(System.out::println);

            double sum = list.stream().filter(p -> p.getName().toUpperCase().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0, (x, y) -> x + y);
            System.out.println("Soma dos Salarios que começam com 'M': " + sum);
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
