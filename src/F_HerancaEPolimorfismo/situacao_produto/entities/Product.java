package F_HerancaEPolimorfismo.situacao_produto.entities;

public class Product {
    protected String name;
    protected Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String priceTag() {
        return name
                + " R$"
                + String.format(" %.2f", price);
    }
}
