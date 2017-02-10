package ru.bernarsoft.innopolis;


import ru.bernarsoft.innopolis.math.Cubator;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Integer> chisla1 = new ArrayList<Integer>();

        chisla1.add(1);
        chisla1.add(2);
        chisla1.add(3);
        chisla1.add(4);

        ArrayList<Integer> chisla2 = new ArrayList<Integer>();

        chisla2.add(5);
        chisla2.add(6);
        chisla2.add(7);
        chisla2.add(8);



        Thread thread1 = new Thread(new Cubator(chisla1));
        Thread thread2 = new Thread(new Cubator(chisla2));

        thread1.start();
        thread2.start();


    }
}
