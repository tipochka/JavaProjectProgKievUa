package oop.lesson3.homework.computer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xepcoh on 30.09.2016.
 */
public class ComputerRunner {

    public static void main(String[] args) {
        List<Ram> ramList = new ArrayList<>();
        ramList.add(new Ram(2));
        ramList.add(new Ram(2));

        List<HardDisc> hardDiscList = new ArrayList<>();
        hardDiscList.add(new HardDisc(500));
        hardDiscList.add(new HardDisc(1000));

        Computer computer = new Computer(new Processor(), ramList, hardDiscList);
    }

}
