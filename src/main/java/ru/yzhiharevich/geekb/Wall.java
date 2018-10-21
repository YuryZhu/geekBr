package ru.yzhiharevich.geekb;

public class Wall extends Obstacle {
    protected int heighOfWall() {
        int height = new Randomiser().randomiser(5);
        System.out.println("The height of the obstacle = " + height + " meters");
        return height;
    }
}
