package Secao20_ProgramacaoFuncional_ExpressoesIrregulares.InterfacePredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        int min = 100;
        Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        //Predicate<Product> pred = p -> p.getPrice() >= min;
        // list.removeIf(p -> p.getPrice() >=100);
        //list.removeIf(p -> p.getPrice() >=min);
        // list.removeIf(new ProductPredicate());
        //list.removeIf(Product::staticProductPredicate);
        //list.removeIf(Product::nonstaticProductPredicate);
        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
