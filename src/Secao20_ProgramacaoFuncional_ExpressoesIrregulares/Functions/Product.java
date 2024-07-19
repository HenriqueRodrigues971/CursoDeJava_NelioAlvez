package Secao20_ProgramacaoFuncional_ExpressoesIrregulares.Functions;

public class Product {
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String staticUpperCaseName(Product p) {

        return p.getName().toUpperCase();
    }

    public String nonstaticProductUpperCaseName() {
        return getName().toUpperCase();

    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
