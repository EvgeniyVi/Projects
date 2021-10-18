package com.company.CarPark;

import com.company.Dispatcher.CallCar;

import java.util.ArrayList;


public class Car {

    CallCar callCar = new CallCar();
    int id;
    public String nameСar;
    public String color;
    public int registrationNumber;


    public Car(int id, String nameСar, String color, int registrationNumber) {
        this.id = id;
        this.nameСar = nameСar;
        this.color = color;
        this.registrationNumber = registrationNumber;
    }


    public void passengerCar() {
        Car Chevrolet = new Car(1, "Chevrolet aveo", "синего", 2416);
        Car Nissan = new Car(2, "Nissan leaf", "серого", 1258);
        Car Toyota = new Car(3, "Toyota prado", "черного", 1140);
        Car Ravon = new Car(4, "Ravon ", "белого", 3658);
        Car Mercedes = new Car(5, "Mercedes", "серого", 1258);
        ArrayList<Car> passengerCar = new ArrayList<>();
        passengerCar.add(Chevrolet);
        passengerCar.add(Nissan);
        passengerCar.add(Toyota);
        passengerCar.add(Ravon);
        passengerCar.add(Mercedes);
        callCar.randomCar(passengerCar);
    }

    public void truckCar() {
        Car Gazel = new Car(6, "Gazel", "белого", 1012);
        Car Tata = new Car(7, "Tata", "белого", 2569);
        Car Man = new Car(8, "Man", "красного", 2396);
        Car Volvo = new Car(9, "Volvo", "синего", 5123);
        Car Reno = new Car(10, "Reno", "желтого", 1713);
        ArrayList<Car> truckCar = new ArrayList<>();
        truckCar.add(Gazel);
        truckCar.add(Tata);
        truckCar.add(Man);
        truckCar.add(Volvo);
        truckCar.add(Reno);
        callCar.randomCar(truckCar);
    }

    public Car() {
    }
}
