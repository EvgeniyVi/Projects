package com.company.Tests;

import com.company.CarPark.Car;
import com.company.Dispatcher.CallCar;
import com.company.Dispatcher.CarDispatcher;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class CarDispatcherTest {
    private CarDispatcher carDispatcher;

    @BeforeMethod
    public void setUp() {
        carDispatcher = new CarDispatcher();
    }

    @Test
    public void randomDispatcher() {
        ArrayList<String> testDispatcher = new ArrayList<>();
        CarDispatcher Yulia = new CarDispatcher("Yulia");
        testDispatcher.add(Yulia.name);
        carDispatcher.randomDispatcher(testDispatcher);
        Assert.assertEquals("Yulia", carDispatcher.randomDispatcher(testDispatcher));
    }
}
