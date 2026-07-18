package F_HerancaEPolimorfismo.exerciciofixacao1.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return price + customsFee;
    }

    @Override
    public String priceTag() {
        return name
                + " R$ "
                + totalPrice()
                + " (Taxa de alfandegária: R$"
                + String.format(" %.2f", customsFee)
                + ")";
    }
}
