package JavaPractice;

abstract class Bike11 {
    abstract void run();
    abstract void move();
}

class GtContinental extends Bike11 {
    public void move() {
        System.out.println("This bike moves at high speed");
    }

    public void run() {
        System.out.println("This bike moves with fuel");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        GtContinental g = new GtContinental();
        g.move();
        g.run();
    }
}