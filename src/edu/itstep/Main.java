package edu.itstep;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 3. Створити об`єкт класу ArrayList, який зберігає як ексземпляри User, так і екземпляри Employee
        ArrayList<User> arrayList = new ArrayList<>() {{
            add(new User("Andrii Antonov", 22, 'M', "andrii@mail.com", "UA"));
            add(new User("Stephan Curry", 30, 'M', "step@gmail.com", "US"));
            add(new User("Madonna Louise", 63, 'F', "madonna@mail.com", "US"));
            add(new User("Irena Quarpa", 40, 'F', "quarpa@gmail.com", "FR"));

            add(new Employee("First Employee", 17, 'M', "fe@mail.com",
                    "UA", 5000, "java developer", "IT"));
            add(new Employee("Second Employee", 16, 'F', "se@gmail.com",
                    "PL", 8000, "angular developer", "IT"));
            add(new Employee("Third Employee", 29, 'F', "te@gmail.com",
                    "UA", 4000, "designer", "UI"));
            add(new Employee("Fourth Employee", 15, 'M', "fe@gmail.com",
                    "LT", 7000, "php developer", "IT"));
            add(new Employee("Fifth Employee", 22, 'F', "fe@il.com",
                    "UA", 15000, "recruiter", "HR"));
            add(new Employee("Sixth Employee", 20, 'F', "se@mail.com",
                    "UK", 10000, "recruiter", "HR"));
        }};

        // 4. Робота з Arraylist:
        // - Отримати arrayList тільки з користувачами (ексземплярами User, а не Employee);
        System.out.println("Тільки Users: ");
        for (User user : arrayList) {
            if (user instanceof Employee == false)
                System.out.println("Name: " + user.getFullName() +
                                ", Age: " + user.getAge() +
                            ", Gender: " + user.getGender() +
                        ", Email: " + user.getEmail() +
                    ", Country: " + user.getResidenceCountry() + ";"
                );
        }

        // - Отримати середній вік всіх
        System.out.println("\nСередній вік Users & Employees: " + averageAge(arrayList, false) + " років;");

        // - Отримати середній вік серед неповнолітніх
        System.out.println("Середній вік серед неповнолітніх: " + averageAge(arrayList, true) + " років;");

        // - Отримати середній оклад на відділ
        String[] departments = new String[]{"IT", "HR", "UI"};

        System.out.println("Середній оклад на відділ: "
                    + departments[0] + " - " + averageSalary(arrayList, departments[0]) + "$ \t"
                + departments[1] + " - " + averageSalary(arrayList, departments[1]) + "$ \t"
            + departments[2] + " - " + averageSalary(arrayList, departments[2]) + "$ \t"
        );

        // - Отримати користувачів у яких пошта "gmail.com";
        System.out.println("\nКористувачі з поштою \"gmail.com\": ");
        arrayList.stream()
                .filter(p -> p.getEmail().contains("gmail.com"))
            .forEach(p -> System.out.println(p.getFullName() + " - " + p.getEmail()));

        // - Отримати електронні скриньки всіх повнолітніх жінок, не старших 30ти, які проживають в Україні та працюють
        System.out.println("\nЕлектронні скриньки працюючих жінок не старших 30ти: ");
        arrayList.stream()
                    .filter(p -> p.getAge() >= 18 && p.getAge() <= 30)
                .filter(p -> p.getResidenceCountry().contains("UA"))
            .filter(p -> p instanceof Employee)
        .forEach(p -> System.out.println(p.getEmail()));
    }

    private static int averageAge(ArrayList<User> arrayList, boolean minors) {
        int avg = 0;

        if (minors) {
            ArrayList<User> temp = (ArrayList<User>) arrayList.clone();
            temp.removeIf(s -> s.getAge() >= 18);

            for (int i = 0; i < temp.size(); i++) {
                avg += temp.get(i).getAge();
            }

            avg /= temp.size();
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                avg += arrayList.get(i).getAge();
            }

            avg /= arrayList.size();
        }
        return avg;
    }

    private static int averageSalary(ArrayList<User> arrayList, String department) {
        int avg = 0;
        int size = 0;

        for (int i = 0; i < arrayList.size(); ++i) {
            if (arrayList.get(i) instanceof Employee) {
                Employee temp = (Employee) arrayList.get(i);
                if (temp.getDepartment().contains(department)) {
                    avg += temp.getSalary();
                    ++size;
                }
            }
        }

        avg /= size;
        return avg;
    }
}


