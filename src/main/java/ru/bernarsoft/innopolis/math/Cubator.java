package ru.bernarsoft.innopolis.math;

import ru.bernarsoft.innopolis.consumers.Consumer;

import java.util.ArrayList;


public class Cubator implements Runnable {

    private ArrayList<Integer> list = new ArrayList<Integer>();
    private int cube;

    public Cubator(ArrayList list) {
        this.list = list;
    }

    public void run() {
        for(int i = 0; i < list.size(); i++ ) {
            cube += ( list.get(i)*list.get(i)*list.get(i));
        }
        Consumer.printMessege(cube, 0, 0);
    }
}
