package com.company.CarPark;

import com.company.Dispatcher.CarDispatcher;

import java.io.IOException;

public class CarPark {
    CarDispatcher carDispatcher;


    public void init() {

        carDispatcher = new CarDispatcher();
    }

    public void start() throws IOException, InterruptedException {
        carDispatcher.speakHello();
    }
}
