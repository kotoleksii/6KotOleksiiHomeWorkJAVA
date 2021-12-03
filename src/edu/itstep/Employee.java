package edu.itstep;

public class Employee extends User {
    private int salary;
    private String post;
    private String department;

    public Employee(String fullName, int age, char gender, String email, String residenceCountry, int salary, String post, String department) {
        super(fullName, age, gender, email, residenceCountry);
        this.salary = salary;
        this.post = post;
        this.department = department;
    }

    public Employee(String fullName, int age, char gender, String email, String residenceCountry) {
        super(fullName, age, gender, email, residenceCountry);
    }
}
