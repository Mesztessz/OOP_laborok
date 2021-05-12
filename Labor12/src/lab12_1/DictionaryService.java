package lab12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DictionaryService {
    private IDictionary dictionary;

    public DictionaryService(DictionaryType type) {
        this.dictionary = DictionaryProvider.createDictionary(type);
    }

    public boolean findWord(String word) {
        return dictionary.find(word);
    }

    public ArrayList<String> findWordsFile(String filename){
        ArrayList<String> missingWords = new ArrayList<>();
        Scanner scanner = null;
        try{
            scanner = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Cant open the file named : " + filename);
            System.exit(1);
        }

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String regex = "[a-zA-Z]+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()){
                String temp = matcher.group();
                if(!findWord(temp.toLowerCase(Locale.ROOT))){
                    if(!missingWords.contains(temp)) {
                        missingWords.add(temp);
                    }
                }
            }
        }
        return missingWords;
    }

}
