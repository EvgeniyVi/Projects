//package com.company.Client;
//
//import com.company.CarPark.Car;
//import com.company.Dispatcher.CarDispatcher;
//import com.company.Dispatcher.RoadAndPrice;
////
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Client {
//    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//    public double kilometerWay() throws IOException,NumberFormatException {
//        System.out.println("Укажите,сколько километров необходимо проехать?");
//        String kilometers = reader.readLine();
//        double inputKilometers = 0;
//        try {
//            inputKilometers = Double.parseDouble(kilometers);
//        } catch (NumberFormatException ex) {
//            System.out.println("not a number");
//            throw new NumberFormatException();
//        }
//        return inputKilometers;
//////        double inputKilometers = Double.parseDouble(null);
////        if (kilometers.matches("-?\\d+(\\.\\d+)?" )) {
////            inputKilometers = Double.parseDouble(kilometers);;
////        }else{
//////            System.out.println("Укажите число");
//////            System.out.println(inputKilometers + " else");
////            kilometerWay();
////        }
//
//    }

//    public void answerClient() throws IOException, InterruptedException {
//        RoadAndPrice roadAndPrice = new RoadAndPrice();
//        Car car = new Car();
//        CarDispatcher carDispatcher = new CarDispatcher();
//        String answer = reader.readLine();
//        if (!answer.matches("-?\\d+")) {
//            System.out.println("Выберите пожалуйста из списка");
//            answerClient();
//        } else if (Integer.parseInt(answer) == 1) {
//            roadAndPrice.pathWay(15.5, kilometerWay());
//            carDispatcher.informationStatus();
//            car.truckCar();
//        } else if (Integer.parseInt(answer) == 2) {
//            roadAndPrice.pathWay(9.8, kilometerWay());
//            carDispatcher.informationStatus();
//            car.passengerCar();
//        } else {
//            System.out.println("мы работаем над созданием этой услуги,выберите пожалуйста из списка");
//            answerClient();
//        }
//    }
//}
