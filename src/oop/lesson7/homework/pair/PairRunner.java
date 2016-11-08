package oop.lesson7.homework.pair;

import java.util.logging.SocketHandler;

/**
 * Created by Xepcoh on 19.10.2016.
 */
public class PairRunner {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10, "test");
        System.out.println("Left: " + pair.getLeft());
        System.out.println("Right: " + pair.getRight());
    }
}
