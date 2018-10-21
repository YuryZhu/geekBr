package ru.yzhiharevich.geekb;

import java.util.Random;

public class Marathon extends Obstacle {
    protected int distanceOfRun() {
        int distance = new Randomiser().randomiser(42);
        System.out.println("The distance of the marathon = " + distance + " kilometers");
        return distance;
    }
}
