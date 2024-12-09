package Seminar1;

public abstract class Product {
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Seminar1.Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
