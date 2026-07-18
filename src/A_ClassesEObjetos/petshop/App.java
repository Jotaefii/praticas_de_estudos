package A_ClassesEObjetos.petshop;

import A_ClassesEObjetos.petshop.model.Pet;

public class App {
    public static void main(String[] args) {

        Pet pet1 = new Pet();
        pet1.name = "Bob";
        pet1.species = "Cachorro";
        pet1.age = 4;
        pet1.weight = 12.5;

        System.out.println("=== PET 1 ===");
        pet1.displayInformation();

        System.out.println("----------------");

        Pet pet2 = new Pet();
        pet2.name = "Mingau";
        pet2.species = "Gato";
        pet2.age = 2;
        pet2.weight = 4.5;

        System.out.println("=== PET 2 ===");
        pet2.displayInformation();

        System.out.println("----------------");
        pet1.toEat();
        pet1.toSleep();
        System.out.println("----------------");
        pet2.toEat();
        pet2.toSleep();
    }
}
