package com.example.cashtrack;

import java.io.Serializable;

    public class Shoppings implements Serializable {

    private int id;
    private String desc;
    private int cost;
    private String date;

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public Shoppings(int id, String desc, int cost, String date) {
        this.id = id;
        this.desc = desc;
        this.cost = cost;
        this.date = date;
    }
}
