package org.example;

import org.example.Models.Bicycle;
import org.example.Models.Car;
import org.example.Models.Motorbike;
import org.example.Models.TV;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Car bmwCar = new Car("BMW", 50000, 200, "gas");

        Motorbike hondaBike = new Motorbike("Honda", 200000, 100);

        TV tv = new TV("LG 50inch", 15000, 50);

        List<FastestModel> list = Arrays.asList(bmwCar, hondaBike);

        String fastest = getFastest(list);

        System.out.println(fastest);

        List<TotalPrice> total = Arrays.asList(bmwCar, tv);

        System.out.println(calculatePrice(total));






    }

   public static String getFastest(List<FastestModel> models){

        Integer fastestSpeed = 0;

        String fastestModel = "";

        for(FastestModel model : models){

                if (model.getMaxSpeed() > fastestSpeed) {
                    fastestSpeed = model.getMaxSpeed();
                    fastestModel = model.getName();
                }
        }
        return "The fastest model is: " + fastestModel;
    }

    public static Integer calculatePrice(List<TotalPrice> models){

        Integer totalPrice = 0;

        for(TotalPrice model : models){
            totalPrice += model.getPrice();
        }

        return totalPrice;
    }
}