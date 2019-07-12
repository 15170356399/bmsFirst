package com.wangchi.firstspringboot.bms.beans;

public class Book {

    private Integer Id;
    private String name;
    private String price;
    private int amount;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Book(Integer id) {
        Id = id;
    }

    public Book() {
    }
}
