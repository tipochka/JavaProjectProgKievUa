package oop.lesson3.homework.computer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xepcoh on 30.09.2016.
 */
public class Computer {
    private Processor processor;
    private List<Ram> ramList = new ArrayList<>();
    private List<HardDisc> hardDiscsList = new ArrayList<>();
    private boolean power = false;

    public Computer(Processor processor, List<Ram> ramList, List<HardDisc> hardDiscsList) {
        this.processor = processor;
        this.ramList = ramList;
        this.hardDiscsList = hardDiscsList;
    }

    public void switchOn() {
        power = true;
    }

    public void switchOff() {
        power = false;
    }

    public String checkVirus() {
        //process check for virus
        return "Checked";
    }

    public void getSizeHardDisc() {
        int size = 0;

        for (HardDisc hardDisc : hardDiscsList) {
            size += hardDisc.getSize();
        }

        System.out.println(size);
    }
}
