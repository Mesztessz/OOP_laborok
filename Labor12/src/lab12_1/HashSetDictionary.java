package lab12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDictionary implements IDictionary{
    private Set<String> words = new HashSet<>();
    private static HashSetDictionary instance = null;

    private HashSetDictionary(){
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

    public static IDictionary newInstance() {
        if (instance == null) {
            instance = new HashSetDictionary();
        }
        return instance;
    }

    @Override
    public boolean add(String word) {
        if(find(word)){
            return false;
        }
        else{
            words.add(word);
            return true;
        }
    }

    @Override
    public boolean find(String word) {
        return words.contains(word);
    }

    @Override
    public int size() {
        return words.size();
    }
}
