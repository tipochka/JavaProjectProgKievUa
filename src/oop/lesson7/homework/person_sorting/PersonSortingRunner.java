package oop.lesson7.homework.person_sorting;

import java.util.*;

/**
 * Created by Xepcoh on 20.10.2016.
 */
public class PersonSortingRunner {

    public static void main(String[] args) {

        List<Person> persons = personsFill();

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
