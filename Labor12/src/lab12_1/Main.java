package lab12_1;

public class Main {
    public static void main(String[] args) {
//        DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);
//        Scanner scanner = new Scanner(System.in);
//        while( true ) {
//            System.out.print("Word to find ( Enter <end> for exit): ");
//            String word = scanner.nextLine();
//            if( word.equalsIgnoreCase( "end")){
//                break;
//            }
//            System.out.println(" Find(" + word + "): " + service.findWord(word));
//        }
        long startTime = System.nanoTime();
        DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        System.out.println("Time in miliseconds for array list: " + time/1000000);

        startTime = System.nanoTime();
        service = new DictionaryService(DictionaryType.TREE_SET);
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("Time in miliseconds for tree set: " + time/1000000);

        startTime = System.nanoTime();
        service = new DictionaryService(DictionaryType.HASH_SET);
        endTime = System.nanoTime();
        time = endTime - startTime;
        System.out.println("Time in miliseconds for hash set: " + time/1000000);

    }
}
