public abstract class Person {

    String name;
    String surname;
    int age;
    int birthYear;
    int year;


    protected Person() {
    }

    public Person(String name, String surname, int age, int birthYear, int year, int hireDate, String companyName, double salaryFields) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthYear = birthYear;
        this.year = year;
    }

    public int getAge(){
        return age;
    }
}
