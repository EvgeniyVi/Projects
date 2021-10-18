package com.company.Tests;

import com.company.CarPark.Car;
import com.company.Dispatcher.CallCar;
import com.company.Dispatcher.CarDispatcher;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class CallCarTest {
    private CallCar callCar;

    @BeforeMethod
    public void setUp() {
        callCar = new CallCar();
    }

    @Test
    void randomCar() {
        String consoleOutput = null;
        PrintStream originalOut = System.out;

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            ArrayList<Car> testCar = new ArrayList<>();
            testCar.add(new Car(9, "Volvo", "синего", 5123));
            callCar.randomCar(testCar);
            consoleOutput = outputStream.toString();
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertEquals(consoleOutput, "К вам выехал автомобиль " + "Volvo" + " " + "синего" + " цвета " + " с номером " + 5123 + "\r\n");
    }

}
