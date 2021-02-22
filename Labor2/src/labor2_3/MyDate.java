package labor2_3;

public class MyDate {
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
}
