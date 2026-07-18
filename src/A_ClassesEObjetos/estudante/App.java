package A_ClassesEObjetos.estudante;

import A_ClassesEObjetos.estudante.model.Student;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Digite o nome do aluno: ");
        student.nameStudent = sc.nextLine();

        System.out.print("Digite a primeira nota - MAX 30: ");
        student.note1 = sc.nextDouble();
        if (!student.firstGardeValidation()){
            System.out.println("Valor invalido!");
            return;
        }

        System.out.print("Digite a segunda nota - MAX 35: ");
        student.note2 = sc.nextDouble();
        if (!student.secondGradeValidation()){
            System.out.println("Valor invalido!");
            return;
        }

        System.out.print("Digite a terceira nota - MAX 35: ");
        student.note3 = sc.nextDouble();
        if (!student.thirdGradeValidation()){
            System.out.println("Valor invalido!");
            return;
        }

        student.printResult();

    }
}
