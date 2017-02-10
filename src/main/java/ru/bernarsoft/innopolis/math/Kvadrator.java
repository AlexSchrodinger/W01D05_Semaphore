package ru.bernarsoft.innopolis.math;

import ru.bernarsoft.innopolis.consumers.Consumer;

import java.util.ArrayList;


public class Kvadrator implements Runnable {

    private final ArrayList<Integer> list;
    private final Consumer consumer;

    public Kvadrator(ArrayList list, Consumer consumer) {
        this.list = list;
        this.consumer = consumer;
    }

    public void run() {
        for (Integer i : list) {
            int kvadrat = (i * i);
                consumer.printMessege(0, kvadrat, 0);
        }
    }
}
