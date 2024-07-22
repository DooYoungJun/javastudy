package day6;

public class Customized {

    public static void main(String[] args) {
        Car c = new Car("V8", "4", "4", "2", 50000);
        c.printEngine();
        c.printDoor();
        c.printWheel();
        c.printMirror();
        c.printPrice();
    }
}