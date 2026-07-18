package D_DataEHora.EmprestimoLivro;

import D_DataEHora.EmprestimoLivro.model.Loan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Loan loan = new Loan();

        LocalDate dataHoje = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Livro: ");
        loan.setNameBook(sc.nextLine());

        System.out.print("Data de emprestimo: ");
        loan.setDateLoan(LocalDate.parse(sc.nextLine(), fmt));

        loan.setDateReturn(loan.getDateLoan().plusDays(14));

        System.out.println("---------------------------------");

        System.out.println(loan);
        System.out.print("Situção: ");

        if (dataHoje.isAfter(loan.getDateReturn())){
            System.out.println("ATRASADO!");

            long daysLate = ChronoUnit.DAYS.between(loan.getDateReturn(), dataHoje);
            System.out.println("DIAS DE ATRASO: " + daysLate);

            double valueFine = daysLate * 2.50;
            System.out.printf("MULTA A PAGAR: R$%.2f%n", valueFine);

        } else {
            System.out.println("ESTÁ NO PRAZO!");
        }

        System.out.println("---------------------------------");
    }
}
