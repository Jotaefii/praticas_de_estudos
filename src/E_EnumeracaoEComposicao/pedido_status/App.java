package E_EnumeracaoEComposicao.pedido_status;

import E_EnumeracaoEComposicao.pedido_status.entities.Client;
import E_EnumeracaoEComposicao.pedido_status.entities.Order;
import E_EnumeracaoEComposicao.pedido_status.entities.OrderItem;
import E_EnumeracaoEComposicao.pedido_status.entities.Product;
import E_EnumeracaoEComposicao.pedido_status.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime moment = LocalDateTime.now();

        System.out.println("Entre com dados do cliente: ");
        System.out.print("Nome: ");
        String nameClient = sc.nextLine();
        System.out.print("Email: ");
        String emailClient = sc.nextLine();
        System.out.print("Data de nascimento (dd/mm/aaaa): ");
        LocalDate birthDate = LocalDate.parse(sc.next(), fmt);

        Client client = new Client(nameClient, emailClient, birthDate);

        System.out.println("Entre com o status do pedido: ");
        OrderStatus[] status = OrderStatus.values(); // cria um vetor de cada valor que tem no enum

        for (int i = 0; i < status.length; i++) {
            System.out.println((i + 1) + " - " + status[i]);
        }

        System.out.print("Status: ");
        int opcao = sc.nextInt();

        OrderStatus orderStatus = status[opcao - 1]; // pega a opcao q eu escolher

        System.out.print("Quantos itens neste pedido? ");
        int numItens = sc.nextInt();
        sc.nextLine();

        Order order = new Order(moment, orderStatus, client);

        for (int i = 0; i < numItens; i++) {
            System.out.println("Entre com os dados do item #" + (i + 1) + ":");
            System.out.print("Nome do produto: ");
            String productName = sc.nextLine();
            System.out.print("Preço do produto: R$");
            double productPrice = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addOrderItem(orderItem);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
