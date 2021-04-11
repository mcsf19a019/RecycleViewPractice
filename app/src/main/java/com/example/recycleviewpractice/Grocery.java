package com.example.recycleviewpractice;

public class Grocery {
    private int id;
    private String name;
    private int exp;
    private String price;
    public Grocery(int id, String name, int exp, String price) {
        this.id = id;
        this.name = name;
        this.exp = exp;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
