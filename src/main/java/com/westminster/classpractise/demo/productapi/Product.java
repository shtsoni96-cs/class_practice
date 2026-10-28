package com.westminster.classpractise.demo.productapi;
import com.fasterxml.jackson.annotation.JsonCreator;

public class Product {

    private static int instanceCount = 0;

    private int id;
    private String name;
    private int qty;
    private boolean inStock;
    private double price;

    @JsonCreator
    public Product() {
        this(0, null, 0, false, 0.0);
    }

    public Product(int id, String name, int qty, boolean inStock, double price) {
        instanceCount++;
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.inStock = inStock;
        this.price = price;
    }

    public double calculateTotal() {
        return price * qty;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public boolean isInStock() {
        return inStock;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
