package com.company;

import com.company.CarPark.CarPark;

import java.io.IOException;


public class Main {
    public static void main(String args[]) throws IOException, InterruptedException {
        CarPark carPark = new CarPark();
        carPark.init();
        carPark.start();
    }
}
