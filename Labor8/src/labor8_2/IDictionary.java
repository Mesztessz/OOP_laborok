package labor8_2;

public interface IDictionary {
    public final String DISCTIONARY_FILE = "dict.txt";
    public boolean add(String word);
    public boolean find(String word);
    public int size();
}
