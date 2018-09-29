package ru.yzhiharevich.geekb;

public class Boy extends Members {
    int hightofjump = 5;
    int distanceofrun = 20;
    int distanceofswim = 10;
    String name = "Boy";

    public int[] getteammate() {
        int[] ttc = new int[]{distanceofrun, distanceofswim, hightofjump};
        return ttc;
    }
}
