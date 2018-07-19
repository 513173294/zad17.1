package mateusz.barzantny.artykuly;

public class Product {
    private String name;
    private double price;
    private Category category;


    public Product(String name, Category category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name+" "+category+" "+price;
    }
}
