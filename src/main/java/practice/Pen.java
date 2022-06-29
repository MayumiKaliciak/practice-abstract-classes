package practice;

// hides implementation details, can implement an Interace without implementing the methods
// can not be instantiated
// needs to be implemented
abstract class Pen{
    abstract void write(); //does not have body, can be implemented in subclass
    abstract void refill();

    void breakPen(){
        System.out.println("...broken pen");
    }
}
