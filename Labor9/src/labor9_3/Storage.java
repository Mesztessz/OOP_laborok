package labor9_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Storage {
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Integer> ids = new ArrayList<>();
    public Storage(String filename) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("OOP laborok/Labor9/" + filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error opening file: " + filename);
            System.exit(1);
        }
        while(scanner.hasNextLine()){
            String row = scanner.nextLine();
            String[] elements = row.split(" ");
            products.add(new Product(Integer.parseInt(elements[0].trim()), elements[1].trim(), Integer.parseInt(elements[2].trim()), Integer.parseInt(elements[3].trim())));
        }
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getIdentifier()-o2.getIdentifier();
            }
        });
        for(Product e : products){
            ids.add(e.getIdentifier());
        }
    }

    public void printProducts(){
        for(Product e : products){
            System.out.println(e);
        }
    }

    public void update(String filename){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("OOP laborok/Labor9/" + filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error opening file: " + filename);
            System.exit(1);
        }
        int succesfullyUpdated = 0;
        while(scanner.hasNextLine()){
            String row = scanner.nextLine();
            String[] elements = row.split(" ");
            int id = Integer.parseInt(elements[0].trim());
            int amount = Integer.parseInt(elements[1].trim());
            int index = Collections.binarySearch(ids, id);
            if(index > 0){
                succesfullyUpdated++;
                products.get(index).increaseAmount(amount);
            }
        }
        System.out.println("Succesfully updated products: " + succesfullyUpdated);
    }
}
