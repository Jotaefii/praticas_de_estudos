package E_EnumeracaoEComposicao.pedidos.entities;

import E_EnumeracaoEComposicao.pedidos.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addOrderItem (OrderItem orderItem){
        orderItems.add(orderItem);
    }

    public Double total (){
        double total = 0;
        for (OrderItem orderItem : orderItems){
             total += orderItem.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RESUMO DO PEDIDO: \n");
        sb.append("Momento do pedido: ");
        sb.append(moment.format(fmt));
        sb.append("\nStatus do pedido: ");
        sb.append(status);
        sb.append("\nCliente: ");
        sb.append(client + "\n");
        sb.append("Itens do pedido: \n");
        for (OrderItem orderItem : orderItems){
            sb.append(orderItem);
        }
        sb.append(String.format("Total: R$%.2f", total()));

        return sb.toString();
    }
}
