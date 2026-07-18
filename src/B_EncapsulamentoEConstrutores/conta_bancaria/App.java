package B_EncapsulamentoEConstrutores.conta_bancaria;

import B_EncapsulamentoEConstrutores.conta_bancaria.model.BankAccount;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o titular da conta: ");
        String titular = sc.nextLine();

        BankAccount bankAccount = new BankAccount(numberAccount, titular, 0);

        System.out.print("Existe um depósito incial (y/n): ");
        char yOun = sc.next().charAt(0);
        if (yOun == 'y' || yOun == 'Y'){
            System.out.print("Valor inicial do depósito: R$");
            double initialDeposit = sc.nextDouble();
            bankAccount.Deposit(initialDeposit);
        }

        System.out.println("---------------------------------------------");
        System.out.println("Dados da conta: ");
        System.out.println(bankAccount);

        System.out.print("Insira um valor de depósito: R$");
        double valueDeposit = sc.nextDouble();
        bankAccount.Deposit(valueDeposit);

        System.out.println("---------------------------------------------");
        System.out.println("Saldo atuazlizado da conta: ");
        System.out.println(bankAccount);

        System.out.print("Digite um valor de retirada: R$");
        double withdrawal = sc.nextDouble();
        bankAccount.draft(withdrawal);

        System.out.println("---------------------------------------------");
        System.out.println("Saldo atualizado da conta: ");
        System.out.println(bankAccount);
    }
}
