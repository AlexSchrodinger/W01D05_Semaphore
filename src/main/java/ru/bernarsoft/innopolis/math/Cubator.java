package ru.bernarsoft.innopolis.math;

import ru.bernarsoft.innopolis.consumers.Consumer;

import java.util.ArrayList;


public class Cubator implements Runnable {

    private final ArrayList<Integer> list;
    private final Consumer consumer;

    public Cubator(ArrayList list, Consumer consumer) {
        this.list = list;
        this.consumer = consumer;
    }

    public void run() {
        for (Integer i : list) {
            int cube = (i * i * i);
                consumer.printMessege(cube, 0, 0);
        }
    }
}
