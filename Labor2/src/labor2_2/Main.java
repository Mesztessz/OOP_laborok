package labor2_2;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Rectangle[] rectangles = new Rectangle[10];
        Random rand = new Random();
        double Sum = 0;
        for (Rectangle rect:rectangles){
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rect = new Rectangle(length, width);
            System.out.println("Hosszusag: " + rect.getLength() + ", Szelesseg: " + rect.getWidth());
            System.out.println("Kerulet: " + rect.area());
            System.out.println("Terulet: " + rect.perimeter());
            Sum += rect.area();
        }
        System.out.println("Teljes kerulet : " + Sum);
    }
}
