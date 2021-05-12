package lab12_1;

public class DictionaryProvider {
    public static IDictionary createDictionary(DictionaryType dtype){
        IDictionary dictionary = null;
        switch (dtype){
            case ARRAY_LIST: dictionary = ArrayListDisctionary.newInstance();break;
            case HASH_SET: dictionary = HashSetDictionary.newInstance(); break;
            case TREE_SET: dictionary = TreeSetDictionary.newInstance(); break;
        }
        return dictionary;
    }
}
