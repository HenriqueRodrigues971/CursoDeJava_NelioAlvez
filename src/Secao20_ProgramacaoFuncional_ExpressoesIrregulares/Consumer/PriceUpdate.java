package Secao20_ProgramacaoFuncional_ExpressoesIrregulares.Consumer;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
