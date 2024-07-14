package Secao19_Generics_Set_Map.ExercicioFixacaoMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> mp = new LinkedHashMap<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int votos = Integer.parseInt(fields[1].trim());

                if (mp.containsKey(name)) {
                    mp.put(name, mp.get(name) + votos);
                } else {
                    mp.put(name, votos);
                }
                line = br.readLine();
            }
            //exibindo resultado
            for (String key : mp.keySet()) {
                System.out.println(key + ": " + mp.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
