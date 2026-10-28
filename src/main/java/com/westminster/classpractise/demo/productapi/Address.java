package com.westminster.classpractise.demo.productapi;

public class Address {
    int id;
    String name;
    String Province;
    String City;
    String Country;

    Address(int id, String name,String Province,String City,String Country) {
        this.id = id;
        this.name = name;
        this.Province=Province;
        this.City=City;
        this.Country=Country;
    }
    public String getFullAddress() {

        return City + ", " + Province + ", " + Country;
    }
}
