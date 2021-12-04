package edu.itstep;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 3. Створити об`єкт класу ArrayList, який зберігає як ексземпляри User, так і екземпляри Employee
        ArrayList<User> arrayList = new ArrayList<>();

        arrayList.add(new User("Andrii Antonov", 22, 'M', "andrii@mail.com", "UA"));
        arrayList.add(new User("Stephan Curry", 30, 'M', "step@gmail.com", "US"));
        arrayList.add(new User("Madonna Louise", 63, 'F', "madonna@mail.com", "US"));
        arrayList.add(new User("Irena Quarpa", 40, 'F', "quarpa@gmail.com", "FR"));

        arrayList.add(new Employee("First Employee", 17, 'M', "fe@mail.com",
                "UA", 5000, "java developer", "IT"));
        arrayList.add(new Employee("Second Employee", 16, 'F', "se@gmail.com",
                "PL", 8000, "angular developer", "IT"));
        arrayList.add(new Employee("Third Employee", 29, 'F', "te@gmail.com",
                "UA", 4000, "designer", "UI"));
        arrayList.add(new Employee("Fourth Employee", 15, 'M', "fe@gmail.com",
                "LT", 7000, "php developer", "IT"));
        arrayList.add(new Employee("Fifth Employee", 22, 'F', "fe@il.com",
                "UA", 15000, "recruiter", "HR"));
        arrayList.add(new Employee("Sixth Employee", 20, 'F', "se@mail.com",
                "UK", 10000, "recruiter", "HR"));

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
        System.out.println("\nСередній вік Users & Employees: " + averageAge(arrayList) + " років;");

        // - Отримати середній вік серед неповнолітніх
//        arrayList.removeIf(s -> s.getAge() >= 18);
//        System.out.println("Середній вік серед неповнолітніх: " + averageAge(arrayList) + " років;");

        // - Отримати середній оклад на відділ
        // TODO ...........


        // - Отримати користувачів у яких пошта "gmail.com";
//        System.out.println("\nКористувачі з поштою \"gmail.com\": ");
//        arrayList.stream().filter(p -> p.getEmail().contains("gmail.com"))
//                .forEach(p -> System.out.println(p.getFullName() + " - " + p.getEmail()));

        // - Отримати електронні скриньки всіх повнолітніх жінок, не старших 30ти, які проживають в Україні та працюють
        System.out.println("\nЕлектронні скриньки працюючих жінок не старших 30ти: ");
        arrayList.stream().filter(p -> p.getAge() >= 18 && p.getAge() <= 30)
                .filter(p -> p.getResidenceCountry().contains("UA"))
            .filter(p -> p instanceof Employee)
        .forEach(p -> System.out.println(p.getEmail()));
    }

    private static int averageAge(ArrayList<User> arrayList) {
        int avg = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            avg += arrayList.get(i).getAge();
        }

        avg /= arrayList.size();
        return avg;
    }
}


