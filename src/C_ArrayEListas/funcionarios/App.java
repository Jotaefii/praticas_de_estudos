package C_ArrayEListas.funcionarios;

import C_ArrayEListas.funcionarios.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionarios serão registrados? ");
        int value = sc.nextInt();

        for (int i = 0; i < value; i++) {
            System.out.println("Funcionario #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Salario: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }
        System.out.println("-------------------------");

        System.out.println("Lista dos funcionarios:");

        for (Employee l : list){
            System.out.println(l);
        }
        System.out.println("-------------------------");

        System.out.print("Digite o ID do funcionario que tera o salario aumentado: ");
        int receivesId = sc.nextInt();

        for (Employee listEmployee : list){
            if (receivesId == listEmployee.getId()){
                System.out.print("Em quantos % quer aumentar o salario do individuo? ");
                double porcentagem = sc.nextDouble();
                listEmployee.setSalary(listEmployee.percentageCalculation(porcentagem));
                break;
            }
        }
        System.out.println("-------------------------");

        System.out.println("Lista dos funcionarios:");

        for (Employee listEmployee : list){
            System.out.println(listEmployee);
        }

        sc.close();
    }
}
