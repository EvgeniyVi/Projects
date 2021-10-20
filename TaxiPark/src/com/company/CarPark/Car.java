package com.company.CarPark;

//import com.company.Dispatcher.CallCar;

import java.lang.annotation.Inherited;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Car {
    private final int id;
    private final String nameCar;
    private final String color;
    private final String typeCar;
    private final String registrationNumber;



    private Car(Builder builder){
        this.nameCar = builder.nameCar;
        this.color = builder.color;
        this.id = builder.id;
        this.typeCar = builder.typeCar;
        this.registrationNumber = builder.registrationNumber;
    }

    static class Builder{
//        Pattern pattern = Pattern.compile("[^-0-9]" , Integer.parseInt(""));

        private int id;
        private String nameCar;
        private String color = "gray";
        private String typeCar;
        private String registrationNumber;

        public Builder(String nameCar){
            this.nameCar = nameCar;
        }

        public Builder setId(int id){
            this.id = id;
            return this;
        }

        public Builder setColor(String color){
            this.color = color;
            return this;
        }

        public Builder setRegistrationNumber(String registrationNumber){
//

            boolean onlyNumber = registrationNumber.matches("\\d{5}");
            if(!onlyNumber){
                throw new IllegalArgumentException(registrationNumber +" Enter 4 number");
            }
            this.registrationNumber = registrationNumber;
            return this;
        }

        public Builder typeCar(String typeCar){
            this.typeCar = typeCar;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }
    @Override
    public String toString(){
        return "Avto " + nameCar + " color " + color + " number "  + registrationNumber;
    }

}

