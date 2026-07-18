package C_ArrayEListas.pensionato.model;

public class Client {
    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void print (int contador){
        System.out.printf("Room %d: %s | %s%n",contador, this.name, this.email);
    }
}
