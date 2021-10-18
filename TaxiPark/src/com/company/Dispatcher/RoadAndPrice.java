package com.company.Dispatcher;

import java.io.IOException;


public class RoadAndPrice {

    public double pathWay(double kilometerPrice, double kilometerWay) throws IOException {
        double price = kilometerPrice * kilometerWay;
        String s = String.format("%.1f",price);
        System.out.println("Цена составляет " + s + " UAN");
        return price;
    }
}
