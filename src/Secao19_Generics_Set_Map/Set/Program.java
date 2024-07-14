package Secao19_Generics_Set_Map.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        //set.remove("Tablet");
        //set.removeIf(x -> x.length() >= 3); // remove quem tem mais de 3 caracteres
        set.removeIf(x -> x.charAt(0) == 'T');
        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }

    }
}
