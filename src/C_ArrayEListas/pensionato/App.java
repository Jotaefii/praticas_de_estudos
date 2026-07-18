package C_ArrayEListas.pensionato;

import C_ArrayEListas.pensionato.model.Client;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Client[] rooms = new Client[10];

        System.out.println("--- PENSIONATO NO MAXIMO DE 10 QUARTOS ---");
        System.out.println("Quartos entre 0 - 9");
        System.out.print("Quantos quartos serão alugados? ");
        int numRooms = sc.nextInt();

        if (numRooms > 10){
            return;
        }

        for (int i = 0; i < numRooms; i++) {
            sc.nextLine();
            System.out.println("Cliente #" + (i + 1));
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int room = sc.nextInt();

            rooms[room] = new Client(name, email);
        }

        System.out.println("--------------------------");
        System.out.println("Quartos alugados:");
        int cont = 0;

        for (Client listas : rooms){
            if (rooms[cont] != null){
                listas.print(cont);
            }
            cont++;
        }
    }
}
