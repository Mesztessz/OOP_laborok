package labor11_1;

public class TakeSomeFromArray extends Thread{
    private String[] array;
    private int counter;
    private String str;
    private int Index;

    public TakeSomeFromArray(String[] array, String str, int counter) {
        this.array = array;
        this.str = str;
        this.counter = counter;
    }

    @Override
    public synchronized void run() {
        int consumed = 1;
        while(counter > 0){
            if(IsInArray()){
                synchronized (array) {
                    array[Index] = " ";
                    if(consumed == 3){
                        System.out.println("String '" + this.str + "' succesfully replaced with ' ' " + consumed + " times, thread finishes its work");
                        counter--;
                        break;
                    }
                    System.out.println("String '" + this.str + "' succesfully replaced with ' ' " + consumed + " times");
                    consumed ++;
                    counter--;
                }
            }
        }
    }

    private boolean IsInArray(){
        for(int i = 0; i < array.length; i++){
            if(array[i].compareTo(str) == 0){
                this.Index = i;
                return true;
            }
        }
        return false;
    }
}
