package labor9_1;

public class DateUtil {
    public static boolean leapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400) == 0;
    }
    public static boolean isValidDate(int year, int month, int day){
        if(month < 1 || month > 12){
            return false;
        }
        if(day < 1){
            return false;
        }
        if(year < 1){
            return false;
        }
        if(((year % 4 == 0 && year % 100 != 0) || ((year % 400) == 0)) && day < 30 && day > 0){
            return true;
        }
        if(day > 28 && !((year % 4 == 0 && year % 100 != 0) || ((year % 400) == 0))){
            return false;
        }
        if(month == 2 && day > 29){
            return false;
        }
        if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31){
            return false;
        }
        if((month == 2 || month == 4 || month == 6 || month == 9 || month == 11) && day > 30){
            return false;
        }

        return true;
    }
}
