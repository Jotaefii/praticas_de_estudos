package F_HerancaEPolimorfismo.exerciciofixacao2.entities;

public class Individual extends TaxPayer {
    private Double healthSpent;

    public Individual(String name, Double annualIncome, Double healthSpent) {
        super(name, annualIncome);
        this.healthSpent = healthSpent;
    }

    @Override
    public double calculateTax() {
        if (annualIncome < 20000){
            if (healthSpent != 0){
                return (annualIncome * 0.15) - (healthSpent * 0.50);
            }
            return annualIncome * 0.15;
        } else {
            if (healthSpent != 0){
                return (annualIncome * 0.25) - (healthSpent * 0.50);
            }
            return annualIncome * 0.25;
        }
    }
}
