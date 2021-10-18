package com.company.Dispatcher;

import com.company.Client.Client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CarDispatcher {

    Client client = new Client();
    public String name;
    Random random = new Random();

    public CarDispatcher(String name) {

        this.name = name;
    }

    public CarDispatcher() {
    }

    public ArrayList<String> listDispatcher() {
        CarDispatcher Yulia = new CarDispatcher("Юлия");
        CarDispatcher Oleg = new CarDispatcher("Олег");
        CarDispatcher Vladimir = new CarDispatcher("Владимир");
        CarDispatcher Igor = new CarDispatcher("Игорь");
        CarDispatcher Yana = new CarDispatcher("Яна");
        ArrayList<String> dispatcher = new ArrayList<>();
        dispatcher.add(Yulia.name);
        dispatcher.add(Oleg.name);
        dispatcher.add(Vladimir.name);
        dispatcher.add(Igor.name);
        dispatcher.add(Yana.name);
        return dispatcher;
    }


    public String randomDispatcher(ArrayList<String> dispatcher) {
        int size = dispatcher.size();
        int index = random.nextInt(size);
        String result = dispatcher.get(index);
        return result;
    }

    public void informationStatus() throws InterruptedException {
        System.out.println("Ваш заказ принят в обработку,ожидайте...");
        Thread.sleep(2000);
    }

    public void speakHello() throws IOException, InterruptedException {
        System.out.println("Вас привествует служба такси,меня зовут " + randomDispatcher(listDispatcher()) + "\n"
                + "Какой вид перевозок Вас интерусет?" + "\n" +
                "1.Грузоперевозки" + "\n" +
                "2.Пассажироперевозки" + "\n" +
                "(укажите цифру)" + "\n");
        client.answerClient();
    }


}
