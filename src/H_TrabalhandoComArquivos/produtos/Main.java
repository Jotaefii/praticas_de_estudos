package H_TrabalhandoComArquivos.produtos;

import H_TrabalhandoComArquivos.produtos.entities.Product;

import java.io.*;
import java.util.Scanner;

// Usando File para criar pasta e arquivo
// BufferedWriter e FileWriter para a escrita
// BufferedReader e FileReader para leitura

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File pasta = new File(System.getProperty("user.home") + "\\Desktop\\out");
        File arquivo = new File(pasta, "summary.csv");

        try {
            // Se não existir pasta crie uma
            if (!pasta.exists()){
                pasta.mkdir();
            }
            // Se não existir arquivo crie um
            if (!arquivo.exists()){
                arquivo.createNewFile();
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        int opcao = 0;
        while (opcao != 3){
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Entre com o numero de produtos: ");
                    int num = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < num; i++) {
                        System.out.print("Produto: ");
                        String nameProduct = sc.nextLine();
                        System.out.print("Preço: ");
                        double price = sc.nextDouble();
                        System.out.print("Quantidade: ");
                        int quantity = sc.nextInt();
                        sc.nextLine();

                        Product product = new Product(nameProduct, price, quantity);

                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))){
                            bw.write(product + "\n");
                        }
                        catch (IOException e){
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;

                case 2:
                    try (BufferedReader br = new BufferedReader(new FileReader(arquivo))){
                        String linha;
                        while ((linha = br.readLine()) != null){
                            System.out.println(linha);
                        }
                    }
                    catch (IOException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
            }
        }
    }
}
