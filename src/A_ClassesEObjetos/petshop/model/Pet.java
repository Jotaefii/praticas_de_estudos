package A_ClassesEObjetos.petshop.model;

public class Pet {
    public String name;
    public String species;
    public int age;
    public double weight;

    public void toEat (){
        System.out.println(name + " comeu!");
    }

    public void toSleep (){
        System.out.println(name + " dormiu!");
    }

    public void displayInformation (){
        System.out.println("Nome: " + name);
        System.out.println("Espécie: " + species);
        System.out.println("Idade: " + age + " anos");
        System.out.println("Peso: " + weight + " kg");
    }
}
