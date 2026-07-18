package A_ClassesEObjetos.estudante.model;

public class Student {
    public String nameStudent;
    public double note1;
    public double note2;
    public double note3;

    public double finalNote (){
        return (note1 + note2 + note3);
    }

    public boolean firstGardeValidation (){
       return note1 <= 30;
    }

    public boolean secondGradeValidation (){
        return note2 <= 35;
    }

    public boolean thirdGradeValidation (){
        return note3 <= 35;
    }

    public double missingPoints (){
        return 60 - finalNote();
    }

    public void printResult (){
        System.out.println("-------------------------------------------");

        System.out.println("ESTUDANTE: " + nameStudent);
        System.out.printf("NOTA FINAL = %.2f%n", finalNote());
        if (finalNote() > 60){
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
            System.out.printf("FALTAM %.2f PONTOS%n", missingPoints());
        }
    }
}
