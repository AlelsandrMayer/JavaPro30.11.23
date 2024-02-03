package org.example.hw18.second;

public class Product {
    private String type;
    private double price;
    private boolean hasDiscount;

    public Product(String type, int price, boolean discount) {
        this.type = type;
        this.price = price;
        this.hasDiscount = discount;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return hasDiscount;
    }

    public void applyDiscount() {
        price *= 0.9;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + hasDiscount +
                '}';
    }
}
