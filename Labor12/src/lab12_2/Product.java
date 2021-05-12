package lab12_2;

public class Product {
    private int identifier;
    private String name;
    private int amount;
    private int price;

    public Product(int identifier, String name, int amount, int price) {
        this.identifier = identifier;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public void updateAmount(int newAmount){
        this.amount += newAmount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "identifier=" + identifier +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

}
