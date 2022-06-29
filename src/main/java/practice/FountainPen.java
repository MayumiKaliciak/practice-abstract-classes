package practice;

public class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("write");
    }

    @Override
    void refill() {
        System.out.println("refill");
    }

    void changeNib(){
        System.out.println("Changing the nib");
    }
}
