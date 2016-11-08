package oop.lesson5.homework.train_length;

public class TrainRunner{
    public static void main(String[] args) {
        System.out.println(findLength(new TrainTrap()));
    }

    public static int findLength(Train train) {
        int wagon = 1;
        while (true){
            if (wagon > 2 && train.isLightOn() && train.isLength(wagon -1)) {
                return (wagon - 1);
            }

            if(!train.isLightOn()) {
                train.lightOn();
            }

            train.turnRight();
            wagon++;
        }
    }
}
