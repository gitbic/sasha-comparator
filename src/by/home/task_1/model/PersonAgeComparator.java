package by.home.task_1.model;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        //return o1.getAge() - o2.getAge();
        if (o1.getAge() - o2.getAge() == 0){
            return (int) (o1.getSalary() - o2.getSalary());
        }
        return o1.getAge() - o2.getAge();
    }
}
