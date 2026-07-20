package F_HerancaEPolimorfismo.calculo_imposto;

import F_HerancaEPolimorfismo.calculo_imposto.entities.Company;
import F_HerancaEPolimorfismo.calculo_imposto.entities.Individual;
import F_HerancaEPolimorfismo.calculo_imposto.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Entre com o numero de contribuentes: ");
        int numberOfContributors = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfContributors; i++) {
            System.out.println("Dados do contribuente #" + (i + 1));
            System.out.print("Indivíduo ou empresa (i/c): ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Renda anual: ");
            double anualIncome = sc.nextDouble();

            if (ch == 'i'){
                System.out.print("Despesas com saúde: ");
                double healthExpenditures = sc.nextDouble();

                taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Número de funcionários: ");
                int numberOfEmployees = sc.nextInt();

                taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("IMPOSTOS PAGOS: ");

        double totalTaxes = 0;

        for (TaxPayer taxPayer : taxPayers){
            System.out.println(taxPayer);
            totalTaxes += taxPayer.calculateTax();
        }

        System.out.println();
        System.out.print("IMPOSTOS TOTAIS: " + totalTaxes);
    }
}
