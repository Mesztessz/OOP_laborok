package labor8_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DictionaryService {
    private IDictionary dictionary;

    public DictionaryService(DictionaryType type) {
        this.dictionary = DictionaryProvider.createDictionary();
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
            String[] elements = line.split(" ");
            for(String e:elements){
                if(!dictionary.find(e.trim())){
                    missingWords.add(e.trim());
                }
            }

        }
        return missingWords;
    }

}
