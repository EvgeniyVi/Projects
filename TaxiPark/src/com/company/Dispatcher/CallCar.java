package com.company.Dispatcher;

import com.company.CarPark.Car;

import java.util.ArrayList;
import java.util.Random;

public class CallCar {

    public void randomCar(ArrayList<Car> listCar) {
        Random random = new Random();
        int size = listCar.size();
        int index = random.nextInt(size);
        String name = listCar.get(index).nameСar;
        String color = listCar.get(index).color;
        int registrationNumber = listCar.get(index).registrationNumber;
        System.out.println("К вам выехал автомобиль " + name + " " + color + " цвета " + " с номером " + registrationNumber);
    }
}
