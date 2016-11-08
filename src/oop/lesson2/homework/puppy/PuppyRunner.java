package oop.lesson2.homework.puppy;

public class PuppyRunner {
    public static void main(String[] args) {
        Puppy puppy = new Puppy("Ralf");

        System.out.println("Name: "+puppy.getName());
        System.out.println("Votes Cast: " + puppy.votesCast());
        System.out.println("Jump: " + puppy.jump());
        System.out.println("Run: "+ puppy.run());
        System.out.println("Bite: "+ puppy.bite());
    }
}
