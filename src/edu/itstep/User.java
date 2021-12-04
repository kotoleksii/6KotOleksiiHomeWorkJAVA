package edu.itstep;

/*
 * 1. Cтворити клас User з інформацією про користувача:
 * повне ім`я,
 * вік,
 * стать,
 * електронна пошта,
 * країна проживання
 */
public class User {
    private String fullName;
    private int age;
    private char gender;
    private String email;
    private String residenceCountry;

    public User(String fullName, int age, char gender, String email, String residenceCountry) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.residenceCountry = residenceCountry;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResidenceCountry() {
        return residenceCountry;
    }

    public void setResidenceCountry(String residenceCountry) {
        this.residenceCountry = residenceCountry;
    }
}
