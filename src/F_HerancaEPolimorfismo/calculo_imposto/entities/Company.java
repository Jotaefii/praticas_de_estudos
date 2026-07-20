package F_HerancaEPolimorfismo.calculo_imposto.entities;

public class Company extends TaxPayer{
    private int numberOfEmployee;

    public Company(String name, Double annualIncome, int numberOfEmployee) {
        super(name, annualIncome);
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public double calculateTax() {
        if (numberOfEmployee < 11){
            return annualIncome * 0.16;
        } else {
            return annualIncome * 0.14;
        }
    }
}
