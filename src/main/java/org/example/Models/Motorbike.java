package org.example.Models;

import org.example.FastestModel;
import org.example.TotalPrice;

public class Motorbike implements FastestModel, TotalPrice {
    private String name;

    private Integer price;

    private Integer maxSpeed;

    public Motorbike(String name, Integer price, Integer maxSpeed) {
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
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
