package edu.itstep;

/*
 * 2. Cтворити клас Employee з інформацією про користувача:
 * вся інформація про User,
 * ставка,
 * посада,
 * відділ,
 */
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
