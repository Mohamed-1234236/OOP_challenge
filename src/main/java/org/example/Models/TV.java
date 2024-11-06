package org.example.Models;

import org.example.FastestModel;
import org.example.TotalPrice;

public class TV implements TotalPrice {
    private String name;

    private Integer price;

    private Integer screenSize;

    public TV(String name, Integer price, Integer screenSize) {
        this.name = name;
        this.price = price;
        this.screenSize = screenSize;
    }

    public String getName() {
        return name;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

    public Integer getScreenSize() {
        return screenSize;
    }
}
