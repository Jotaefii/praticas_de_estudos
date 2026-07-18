package F_HerancaEPolimorfismo.exerciciofixacao1;

import F_HerancaEPolimorfismo.exerciciofixacao1.entities.ImportedProduct;
import F_HerancaEPolimorfismo.exerciciofixacao1.entities.Product;
import F_HerancaEPolimorfismo.exerciciofixacao1.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Entre com o numero de produtos: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Produto #" + i + ": ");
            System.out.print("Coomum, usado ou importado (c/u/i)? ");
            char caractere = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Preço: ");
            Double price = sc.nextDouble();
            sc.nextLine();

            if (caractere == 'c'){
                products.add(new Product(name, price));
            } else if (caractere == 'u') {
                System.out.print("Data de fabricação (dd/mm/aaaa): ");
                LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), fmt);

                products.add(new UsedProduct(name, price, manufactureDate));
            } else {
                System.out.print("Taxa da alfandega: ");
                Double customsFee = sc.nextDouble();

                products.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO: ");
        for (Product productlist : products){
            System.out.println(productlist.priceTag());
        }
    }
}
