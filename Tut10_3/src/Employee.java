public class Employee extends Person {

    int hireDate;
    String companyName;
    double salaryFields;

    public Employee() {
    }

    public Employee(String name, String surname, int birthYear, int currentYear, String companyName, double salaryFields) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.year = year;
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salaryFields = salaryFields;
        this.age = this.year - this.birthYear;
    }

    public int getJobSeniority(){
        int seniority = year - hireDate;
        return seniority;
    }

    public double getSalary(){
        return salaryFields;
    }
}
