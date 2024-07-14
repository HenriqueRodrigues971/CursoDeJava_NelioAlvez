package Secao19_Generics_Set_Map.HashCode_Equals;

public class program {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Maria", "Maria@gmai.com");
        Cliente c2 = new Cliente("Maria", "Maria@gmai.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
    }
}