package Secao19_Generics_Set_Map.GenericsDelimitados;

import Secao19_Generics_Set_Map.GenericsDelimitados.entities.Product;
import Secao19_Generics_Set_Map.GenericsDelimitados.services.CalculationServices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        String path = "/home/henrique/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Product x = CalculationServices.max(list);
            System.out.println("Most expensive: ");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

