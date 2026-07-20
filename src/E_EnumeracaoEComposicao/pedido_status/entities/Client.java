package E_EnumeracaoEComposicao.pedido_status.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String name;
    private String email;
    private LocalDate birthDate;

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return name + " - "
                + "(" + fmt.format(birthDate) + ")"
                + " - " + email;
    }
}
