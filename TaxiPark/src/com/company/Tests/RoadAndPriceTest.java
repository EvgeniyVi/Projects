package com.company.Tests;

import com.company.Dispatcher.RoadAndPrice;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RoadAndPriceTest {

    private RoadAndPrice roadAndPrice = new RoadAndPrice();

    @Test
    void roadAndPrice() throws Exception {
        Assert.assertEquals(31, roadAndPrice.pathWay(15.5, 2));
    }
}
