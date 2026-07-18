package D_DataEHora.EmprestimoLivro.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Loan {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String nameBook;
    private LocalDate dateLoan;
    private LocalDate dateReturn;

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public LocalDate getDateLoan() {
        return dateLoan;
    }

    public void setDateLoan(LocalDate dateLoan) {
        this.dateLoan = dateLoan;
    }

    public LocalDate getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(LocalDate dateReturn) {
        this.dateReturn = dateReturn;
    }

    @Override
    public String toString() {
        return "Livro: " + nameBook +
                "\nData do empréstimo: " + dateLoan.format(fmt) +
                "\nData do prazo: " + dateReturn.format(fmt) +
                "\n---------------------------------";
    }
}
