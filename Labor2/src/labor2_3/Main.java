package labor2_3;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        MyDate[] date = new MyDate[1000];
        Random rand = new Random();
        int counter = 0;
        for(MyDate mydate: date){
            int year = rand.nextInt(2022);
            int month = rand.nextInt(13);
            int day = rand.nextInt(32);
            mydate = new MyDate(year, month, day);
            if(DateUtil.isValidDate(year, month, day)){
                System.out.println(mydate.toString());
            }
            else{
                counter ++;
            }
        }
        System.out.println("A nem ervenyes datumok szama: " + counter);
    }
}
