package Secao20_ProgramacaoFuncional_ExpressoesIrregulares.InterfacePredicate;

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

    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100;
    }

    public boolean nonstaticProductPredicate(){
        return price >= 100.0;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
