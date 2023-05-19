package by.home.task_1;

import by.home.task_1.model.Person;
import by.home.task_1.model.PersonAgeComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Pasha", 37, 1000000.9),
                new Person("Sasha", 29, 32956.0),
                new Person("Vasya", 33, 16468),
                new Person("Katya", 22, 8794),
                new Person("Petya", 29, 1212),
                new Person("Lena", 29, 135),
                new Person("Misha", 29, 353.0),
        };

        for (Person person : people) {
            System.out.println(person);
        }

        PersonAgeComparator pac = new PersonAgeComparator();
        Arrays.sort(people, pac);

        System.out.println("--------------------------");
        for (Person person : people) {
            System.out.println(person);
        }

    }
}
