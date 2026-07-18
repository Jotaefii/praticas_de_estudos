package E_EnumeracaoEComposicao.pedidos.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public double subTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return product.name
             + String.format(", R$%.2f", price)
             + ", Quantidade: "
             + quantity
             + String.format(", Subtotal: R$%.2f", subTotal())
             + "\n";
    }
}
