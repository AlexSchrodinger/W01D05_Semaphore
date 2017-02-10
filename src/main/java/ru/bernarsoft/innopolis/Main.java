package ru.bernarsoft.innopolis;


import ru.bernarsoft.innopolis.consumers.Consumer;
import ru.bernarsoft.innopolis.math.Cubator;
import ru.bernarsoft.innopolis.math.Kvadrator;
import ru.bernarsoft.innopolis.math.Prostator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> chisla = new ArrayList<Integer>();
        Collections.addAll(chisla, 1, 2, 3, 4, 5);

        Consumer consumer = new Consumer();


        Thread[] threads = new Thread[6];
        threads[0] = new Thread(new Cubator(chisla, consumer));
        threads[1] = new Thread(new Cubator(chisla, consumer));
        threads[2] = new Thread(new Kvadrator(chisla, consumer));
        threads[3] = new Thread(new Kvadrator(chisla, consumer));
        threads[4] = new Thread(new Prostator(chisla, consumer));
        threads[5] = new Thread(new Prostator(chisla, consumer));

        for (Thread th:threads) {
            th.start();
        }

        for (Thread th:threads) {
            th.join();
        }

        System.out.println("Result: " + consumer.getSum());

    }
}
