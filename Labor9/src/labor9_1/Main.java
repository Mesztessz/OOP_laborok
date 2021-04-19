package labor9_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList <MyDate> dates = new ArrayList<>();
        int year = 2021;
        Random rand = new Random();
        while(dates.size() < 10){
            int month = rand.nextInt(12);
            int day = rand.nextInt(31);
            if(DateUtil.isValidDate(year, month, day)){
                dates.add(new MyDate(year, month, day));
            }
        }
        for(MyDate d:dates){
            System.out.println(d);
        }
        System.out.println();
        Collections.sort(dates);
        for(MyDate d:dates){
            System.out.println(d);
        }
        System.out.println();
    }
}
