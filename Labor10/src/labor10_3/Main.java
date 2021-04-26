package labor10_3;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileUtil.encode("students.csv" , "temp1.csv");
            FileUtil.decode("temp1.csv", "temp2.csv");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

