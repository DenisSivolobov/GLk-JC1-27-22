package by.academy.lesson10.inTheClassroom;


import java.util.Comparator;
import java.util.TreeSet;


public class Main {

    public static void main(String[] args) {
        Comparator<Person> comparator = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        Person vadim = new Person(1, "Vadim", 25);
        Person sveta = new Person(2, "Sveta", 25);
        Person sveta1 = new Person(2, "Sveta", 22);
        Person sveta2 = new Person(2, "Sveta", 21);
        Person bob = new Person(2, "Bob", 25);

        TreeSet<Person> people = new TreeSet<>();
        people.add(vadim);
        people.add(sveta);
        people.add(sveta1);
        people.add(sveta2);
        people.add(bob);

        for (Person person : people) {
            System.out.println(person.getName() + person.getAge());
        }


    }
}
