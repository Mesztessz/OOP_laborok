package labor8_2;

public class DictionaryProvider {
    public static IDictionary createDictionary(){
        return ArrayListDisctionary.newInstance();
    }
}
