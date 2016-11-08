package oop.lesson2.homework.puppy;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public String votesCast(){
        return "Gav";
    }

    public String jump() {
        return "Jump";
    }

    public String run() {
        return "Run";
    }

    public String bite() {
        return "Bite";
    }
}
