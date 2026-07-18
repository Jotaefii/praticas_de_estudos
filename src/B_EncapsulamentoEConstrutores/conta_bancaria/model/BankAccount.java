package B_EncapsulamentoEConstrutores.conta_bancaria.model;

public class BankAccount {
    private int number;
    private String titular;
    private double balance;

    public BankAccount(int number, String titular, double balance) {
        this.number = number;
        this.titular = titular;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public String getTitular() {
        return titular;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposit (double deposit){
        if (deposit <= 0) {
            System.out.println("Não será depositado nada, pois o valor é inválido!");
            return;
        }
        this.balance += deposit;
    }

    public void draft (double draft){
        if (draft > this.balance || draft <= 0) {
            System.out.println("Valor de retirada inválido!");
            return;
        }
        this.balance -= draft + 5;
    }

    @Override
    public String toString() {
        return String.format("Conta: %d, Titular: %s, Saldo: R$%.2f%n" +
                            "---------------------------------------------"
                            ,this.number, this.titular, this.balance);
    }
}
