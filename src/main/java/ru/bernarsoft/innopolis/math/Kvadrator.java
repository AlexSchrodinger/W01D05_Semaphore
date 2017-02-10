package ru.bernarsoft.innopolis.math;

import java.util.ArrayList;


public class Kvadrator implements Runnable {

    private ArrayList<Integer> list = new ArrayList();

    public Kvadrator(ArrayList list) {
        this.list = list;
    }

    public void run() {

        for(int i = 0; i < list.size(); i++ ) {
            list.set(i, list.get(i) * list.get(i));
        }
    }
}
