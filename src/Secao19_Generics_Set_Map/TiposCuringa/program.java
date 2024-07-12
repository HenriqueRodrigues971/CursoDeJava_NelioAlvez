package Secao19_Generics_Set_Map.TiposCuringa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        List<String> myStrings = Arrays.asList("Paulo", "DDD", "Test");
        printList(myInts);
        printList(myStrings);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}
