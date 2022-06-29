package practice;

public class Human extends Monkey implements Animal{

    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("eating...");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping...");
    }
}
