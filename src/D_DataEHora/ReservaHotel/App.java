package D_DataEHora.ReservaHotel;

import D_DataEHora.ReservaHotel.model.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Numero do quarto: ");
        int numRoom = sc.nextInt();
        sc.nextLine();

        System.out.print("Data de entrada (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(sc.nextLine(), fmt);

        System.out.print("Data de saida (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(sc.nextLine(), fmt);

        Reservation reservation = new Reservation(numRoom, checkIn, checkOut);

        System.out.println("--------------------------------");

        System.out.println("Reserva criada: ");

        System.out.println(reservation);
    }
}
