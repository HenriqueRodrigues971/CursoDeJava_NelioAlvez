package Secao19_Generics_Set_Map.IntroducaoAoGenerics;

import Secao19_Generics_Set_Map.IntroducaoAoGenerics.services.PrintService;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //PrintService<Integer> ps = new PrintService<>();
        PrintService<String> ps = new PrintService<>();
        System.out.print("How many values? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {

            String value = sc.nextLine();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("First: " + ps.first());
    }
}
