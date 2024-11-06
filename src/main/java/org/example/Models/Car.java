package org.example.Models;

import org.example.FastestModel;
import org.example.TotalPrice;

public class Car implements FastestModel, TotalPrice {
    private String name;

    private Integer price;

    private Integer maxSpeed;

    private String engineType;


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

    public String getEngineType() {
        return engineType;
    }

    public Car(String name, Integer price, Integer maxSpeed, String engineType) {
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }



}
