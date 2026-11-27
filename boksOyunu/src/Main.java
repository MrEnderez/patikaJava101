import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Boksor b1 = new Boksor("Ali",65,30,80,25);
        Boksor b2 = new Boksor("Mehmet",140,15,90,36);
        Mac mac1 = new Mac(b1,b2);
        mac1.run();
    }
}