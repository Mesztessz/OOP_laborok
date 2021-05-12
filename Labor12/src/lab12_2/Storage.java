package lab12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Storage {
    private Map<Integer, Product> products = new HashMap<>();

    public Storage(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] elements = row.split(" ");
                int ID = Integer.parseInt(elements[0].trim());
                Product newProduct = new Product(ID, elements[1].trim(), Integer.parseInt(elements[2].trim()), Integer.parseInt(elements[3].trim()));
                products.put(ID, newProduct);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error opening file: " + filename);
            System.exit(1);
        }
        System.out.println("Size: " + products.size());
    }


    public void update(String filename) {
        try (Scanner scanner = new Scanner(new File(filename));) {
            int counter = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String items[] = line.split(" ");
                int id = Integer.parseInt(items[0]);
                int amount = Integer.parseInt(items[1]);
                Product product = products.get(id);
                if (product == null) {
                    continue;
                }
                product.updateAmount(amount);
                ++counter;
            }
            System.out.println(filename + ": " + counter + " updates");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
