package workShop04;

public class Quiz04 {
    public static void main(String[] args) {

        Company company = new Company(100);
        System.out.println("연 기본급 합: "+company.getIncome()+" 세후: "+company.getAfterTaxIncome());
        System.out.println("연 보너스 합: "+company.getBonus()+" 세후: "+company.getAfterTexBonus());
        System.out.println("연 지급액 합: "+(company.getAfterTaxIncome()+company.getAfterTexBonus()));

    }
}

class Company {

    double salary;
    double income;
    double afterTaxIncome;
    double bonus;
    double afterTexBonus;

    public Company() {

    }

    public Company(double salary) {
        this.salary = salary;
    }

    public double getIncome() {
        double d = (getSalary()*12);
        return d;
    }

    public double getAfterTaxIncome() {
        double ati = (getSalary()*12)*0.9;
        return ati;
    }

    public double getAfterTexBonus() {
        double atb = (getBonus())-(getBonus()*0.055);
        return atb;
    }

    public double getBonus() {
        bonus = (getSalary()*0.2)*4;
        return bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setAfterTaxIncome(double afterTaxIncome) {
        this.afterTaxIncome = afterTaxIncome;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setAfterTexBonus(double afterTexBonus) {
        this.afterTexBonus = afterTexBonus;
    }
}
