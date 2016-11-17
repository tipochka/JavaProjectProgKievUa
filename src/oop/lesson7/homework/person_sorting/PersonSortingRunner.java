package oop.lesson7.homework.person_sorting;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Xepcoh on 20.10.2016.
 */
public class PersonSortingRunner {

    public static void main(String[] args) {

        List<Person> persons = personsFill();

        List<Person> result = sortByName(filterBetweenAge(persons, 12, 17));

        System.out.println(result);

    }

    private static List<Person> sortByName(List<Person> persons) {
        return persons.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
    }

    private static List<Person> filterBetweenAge(List<Person> persons, int ageFrom, int ageTo) {
        return persons.stream().filter(a -> a.getAge() >=ageFrom && a.getAge() <= ageTo).collect(Collectors.toList());
    }

    private static List<Person> personsFill() {
        return Arrays.asList(
                new Person("Yra", 10),
                new Person("Vania", 16),
                new Person("Jenia", 15),
                new Person("Maxim", 15),
                new Person("Denis", 14),
                new Person("Sasha", 18));
    }


}
