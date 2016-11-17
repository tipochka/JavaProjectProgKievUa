package oop.lesson7.homework.name_sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Xepcoh on 15.11.2016.
 */
public class NamesRunner {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Nik", "Ivan", "Sonia", "Albert");

        Collections.sort(names);
        System.out.println("By alphabet: " + names);

        Collections.reverse(names);
        System.out.println("Revers sort by alphabet: "+names);

        System.out.println("Min name: " +Collections.min(names));

        Collections.sort(names, new LengthComporator());
        System.out.println("By length: " +names);

        Collections.sort(names, new LengthAndNameComporator());
        System.out.println("By length and alphabet: " + names);
    }
}

class LengthComporator implements Comparator<String>{

    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}

class LengthAndNameComporator implements Comparator<String>{

    @Override
    public int compare(String a, String b) {
        int lengthResult = Integer.compare(a.length(), b.length());

        if (lengthResult == 0){
            return a.compareTo(b);
        }

        return lengthResult;
    }
}