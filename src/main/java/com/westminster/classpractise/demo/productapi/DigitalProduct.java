package com.westminster.classpractise.demo.productapi;

public class DigitalProduct extends Product {

    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct() {

    }

    public DigitalProduct(int id, String name, int qty, boolean inStock, double price, String downloadUrl, double fileSizeMB) {
        super(id, name, qty, inStock, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    @Override
    public String getSummary() {
        return "Digital: " + getName()
                + " | " + getDownloadUrl();
    }

}

