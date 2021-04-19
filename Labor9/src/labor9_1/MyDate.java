package labor9_1;

public class MyDate implements Comparable<MyDate>{
    private int year, month, day;
    public MyDate(int year, int month, int day){
        if(year < 1 || (month < 1 || month >12) || (day<1 || day > 31)){
            return;
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return  "year=" + year +
                " month=" + month +
                " day=" + day ;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(MyDate date1) {
        if(this.year != date1.year){
            return this.year - date1.year;
        }
        if(this.month != date1.month){
            return this.month - date1.month;
        }
        if(this.day != date1.day){
            return this.day - date1.day;
        }
        return 0;
    }
}
