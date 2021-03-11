package labor4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class MyArray {
    private int length;
    private double[] elements;

    public MyArray(int length) {
        this.length = length;
        this.elements = new double[length];
    }

    public MyArray(double[] elements) {
        this.length = elements.length;
        this.elements = elements;
    }

    public MyArray(MyArray myarray){
        this.length = myarray.length;
        this.elements = new double[this.length];
        for(int i = 0; i < this.length; i++){
            this.elements[i] = myarray.elements[i];
        }
    }

    public MyArray(String file){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        String line = scanner.nextLine();
        this.length = Integer.parseInt(line);
        this.elements = new double[this.length];
        line = scanner.nextLine();
        String[] elements = line.split(" ");
        for(int i = 0; i < this.length; i++){
            this.elements[i] = Integer.parseInt(elements[i]);
        }
    }

    public void fillRandom(int a, int b){
        Random rand = new Random();
        for(int i = a; i < b; i++){
            this.elements[i] = rand.nextInt(100);
        }
    }

    public double mean(){
        double S = 0;
        for(double element: this.elements){
            S = S + element;
        }
        return S/this.length;
    }

    public double stddev(){
        double T = mean();
        double[] M = this.elements;
        double S = 0;
        for(int i = 0; i < this.length; i++){
            M[i] -= T;
            M[i] *= M[i];
            S += M[i];
        }
        double Dev = Math.sqrt(S / this.length);
        return Dev;
    }

    public void sort(){
        Arrays.sort(this.elements);
    }

    public void print(String string){
        System.out.printf(string + ":");
        for(double element:this.elements){
            System.out.printf("%10.2f ", element);
        }
        System.out.println();
    }
}
