package lab12_1;

public interface IDictionary {
    public final String DISCTIONARY_FILE = "dict.txt";
    public boolean add(String word);
    public boolean find(String word);
    public int size();
}
