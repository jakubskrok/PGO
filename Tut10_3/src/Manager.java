public class Manager extends Employee{

    double bonus;
    double managerSalary;

    public Manager(String name, String surname, int birthYear, int year, String companyName, double salaryFields, double bonus) {
        super(name, surname, birthYear, year,companyName, salaryFields);
        this.bonus=bonus;
        managerSalary=this.salaryFields + this.bonus;
        age = year - birthYear;
    }

    @Override
    public double getSalary(){
        return managerSalary;
    }

    @Override
    public String toString(){
        return "Manager with surname " +surname+ " and age " +age+ " has salary " + managerSalary;
    }
}
