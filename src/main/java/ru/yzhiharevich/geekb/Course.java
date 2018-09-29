package ru.yzhiharevich.geekb;

public class Course {

    public void doIt() {
        Team teammates = new Team();
        int[][] matesttc;
        int[] obstacles;
        int countwins = 0;
        obstacles = obstacle();
        matesttc = teammates.teammates();
        int rec[] = new int[matesttc.length];
        for (int i = 0; i < matesttc.length; i++) {
            countwins = 0;
            for (int j = 0; j < matesttc[i].length; j++) {
                if (matesttc[i][j] > obstacles[j]) {
                    countwins++;
                }
            }
            if (countwins == 3) {
                Team team = new Team();
                team.showresult(i + 1);
            }
            rec[i] = countwins;
        }
    }

    // Creates array of obstacles
    public int[] obstacle() {
        Marathon marathon = new Marathon();
        int run = marathon.distanceOfRun();
        Water water = new Water();
        int swim = water.distanceOfSwim();
        Wall wall = new Wall();
        int height = wall.heighOfWall();
        int[] obstales = new int[]{run, swim, height};
        return obstales;
    }

}
