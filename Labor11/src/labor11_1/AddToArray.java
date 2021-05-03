package labor11_1;

import java.util.Random;

public class AddToArray extends Thread{
    String[] array;
    public AddToArray(String[] array){
        this.array = array;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while(true){
            int temp = rand.nextInt(26);
            char ch = (char)(temp+97);
            String str = ""+ch+ch+ch;
//            System.out.println(str);
            synchronized (array){
                this.array[minIndex()] = str;
                print();
            }

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int minIndex(){
        int minIndex = 0;
        String minValue = array[0];
        for(int i = 1; i < array.length; i++){
            if(minValue.compareTo(array[i]) > 0){
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private void print(){
        for(String str: this.array){
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
