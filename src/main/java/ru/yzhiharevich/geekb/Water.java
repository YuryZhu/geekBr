package ru.yzhiharevich.geekb;

import java.util.Random;

public class Water extends Obstacle {
    protected int distanceOfSwim() {
        int distance = new Randomiser().randomiser(10);
        System.out.println("Swim distance = " + distance + " kilometers");
        return distance;
    }
}
