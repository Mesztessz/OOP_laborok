package lab12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDisctionary implements IDictionary{

    private ArrayList<String> words = new ArrayList<String>();
    private static ArrayListDisctionary instance = null;


    private ArrayListDisctionary() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("OOP laborok/" + DISCTIONARY_FILE));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not foud : " + DISCTIONARY_FILE);
            System.exit(1);
        }
        while(scanner.hasNextLine()){
            String row = scanner.nextLine();
            words.add(row);
        }
    }

    public static IDictionary newInstance(){
        if(instance == null){
            instance = new ArrayListDisctionary();
        }

        return instance;
    }

    @Override
    public boolean add(String word) {
        if(find(word)){
            System.out.println("The word is already in the dictionary");
            return false;
        }
        else{
            words.add(word);
            Collections.sort(words);
            return true;
        }
    }

    @Override
    public boolean find(String word) {
        return Collections.binarySearch(words, word) >= 0;
    }

    @Override
    public int size() {
        return words.size();
    }
}
