package com.company.CarPark;

import java.util.ArrayList;

public class ListCar {

    public ArrayList<Car> addCar(ArrayList<Car> listCar) {
        Car newCar = new Car.Builder("Gazel")
                .setId(1)
                .setRegistrationNumber("2358")
                .build();
        listCar.add(newCar);
        return listCar;
    }

    public ArrayList<Car> removeCar(ArrayList<Car> listCar) {
        listCar.remove(0);
        return listCar;
    }

}
