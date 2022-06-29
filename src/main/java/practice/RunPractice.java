package practice;

import practice.FountainPen;

public class RunPractice {
    public static void main(String[] args) {

        FountainPen fountainPen = new FountainPen();
        fountainPen.changeNib(); //method implemented in FountainPen
        fountainPen.write(); // from abstract class, implemented in FountainPen
        fountainPen.breakPen(); //method implemented in abstract class Pen


        Monkey monkey = new Monkey();
        monkey.bite(); //method implemented in Monkey

        Monkey firstHuman = new Human();
        // can't speak!
        firstHuman.jump(); //method implemented in Monkey

        Human todaysHuman = new Human();
        todaysHuman.speak(); //method implemented in Human
        todaysHuman.sleep(); //from Interface, implemented in Human
    }
}
