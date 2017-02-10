package ru.bernarsoft.innopolis.math;

import ru.bernarsoft.innopolis.consumers.Consumer;

import java.util.ArrayList;


public class Prostator implements Runnable {

    private final ArrayList<Integer> list;
    private final Consumer consumer;

    public Prostator(ArrayList list, Consumer consumer) {
        this.list = list;
        this.consumer = consumer;
    }

    public void run() {
        for (Integer i : list) {
                consumer.printMessege(0, 0, i);
        }
    }
}
