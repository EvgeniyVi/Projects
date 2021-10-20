package com.company;

//import com.company.CarPark.CarPark;

import com.company.CarPark.Car;
import com.company.CarPark.ListCar;

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String args[]) throws IOException, InterruptedException {
        ArrayList<Car> truckCar = new ArrayList<>();
        ArrayList<Car> passengerCar = new ArrayList<>();
        ListCar listCar = new ListCar();
        listCar.addCar(truckCar);
        listCar.removeCar(truckCar);
    }
}
