package G_Execoes.exerciciofixacao;

import G_Execoes.exerciciofixacao.entities.Account;
import G_Execoes.exerciciofixacao.excepetions.WithdrawException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entre com os dados da conta: ");
            System.out.print("Numero: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Ttular: ");
            String holder = sc.nextLine();
            System.out.print("Saldo inicial: R$");
            double initialBalance = sc.nextDouble();
            System.out.print("Limite de saque: R$");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Entre com o valor para saque: R$");
            double withdrawaAmount = sc.nextDouble();
            account.withdraw(withdrawaAmount);

            System.out.println(account);
        }
        catch (WithdrawException e){
            System.out.println("Erro de saque: " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Erro de digitação: Não pode conter letras.");
        }
        catch (IllegalArgumentException e){
            System.out.println("Error digitação: " + e.getMessage());
        }

        sc.close();

    }
}
