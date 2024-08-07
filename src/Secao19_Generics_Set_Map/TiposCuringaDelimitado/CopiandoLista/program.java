package Secao19_Generics_Set_Map.TiposCuringaDelimitado.CopiandoLista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class program {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObject = new ArrayList<Object>();

        copy(myInts, myObject);
        printList(myObject);
        copy(myDoubles, myObject);
        printList(myObject);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
