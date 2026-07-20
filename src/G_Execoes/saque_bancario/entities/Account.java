package G_Execoes.saque_bancario.entities;

import G_Execoes.saque_bancario.excepetions.WithdrawException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        if (!holder.matches("[a-zA-ZÀ-ÿ ]+")){
            throw new IllegalArgumentException("Digite apenas letras no titular.");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws WithdrawException {
        if (amount > withdrawLimit){
            throw new WithdrawException("O valor excede o limite de saque!");
        }
        if (amount > balance){
            throw new WithdrawException("Saldo insuficiente para saque!");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Novo saldo: R$"
                + String.format("%.2f", balance);
    }
}
