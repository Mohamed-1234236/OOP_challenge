package org.example.Models;

import org.example.TotalPrice;

public class Fridge implements TotalPrice {
    private String name;

    private Integer price;

    private Integer maximumFreezingdegree;

    public Fridge(String name, Integer price, Integer maximumFreezingdegree) {
        this.name = name;
        this.price = price;
        this.maximumFreezingdegree = maximumFreezingdegree;
    }

    public String getName() {
        return name;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    public Integer getMaximumFreezingdegree() {
        return maximumFreezingdegree;
    }
}
