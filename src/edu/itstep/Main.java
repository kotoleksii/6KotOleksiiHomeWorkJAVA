package edu.itstep;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> employeesList = new ArrayList<>();
        employeesList.add(new Employee("name", 22, 'F', "ad@mail.com",
                "Uk", 5000, "post", "wd"));
        employeesList.add(new User("name", 22, 'F', "ad@mail.com", "Uk"));
//

    }
}
