package org.example.Models;


import org.example.FastestModel;
import org.example.TotalPrice;

public class Bicycle implements FastestModel, TotalPrice {
    private String name;

    private Integer price;

    private Integer maxSpeed;

    public Bicycle(String name, Integer maxSpeed, Integer price) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }
}
