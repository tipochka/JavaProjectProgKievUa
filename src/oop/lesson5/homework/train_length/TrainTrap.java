package oop.lesson5.homework.train_length;


public class TrainTrap implements Train {
    private Boolean[] wagonsLeight = {true, false, false, true, true, true, false, true};

    private int vagonId = 0;
    private int lastVagonId;

    public TrainTrap() {
        lastVagonId = wagonsLeight.length - 1;
    }

    @Override
    public void turnLeft() {
        if (vagonId == 0) {
            vagonId = lastVagonId;
        }else {
            vagonId--;
        }
    }

    @Override
    public void turnRight() {
        if(vagonId == lastVagonId) {
            vagonId = 0;
        }else{
            vagonId++;
        }
    }

    @Override
    public void lightOn() {
        wagonsLeight[vagonId] = true;
    }

    @Override
    public void lightOff() {
        wagonsLeight[vagonId] = false;
    }

    @Override
    public boolean isLightOn() {
        return wagonsLeight[vagonId];
    }

    @Override
    public boolean isLength(int expectedLength) {
        return (expectedLength == wagonsLeight.length);
    }
}