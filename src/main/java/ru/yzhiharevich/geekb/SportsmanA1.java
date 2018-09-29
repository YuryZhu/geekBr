package ru.yzhiharevich.geekb;

public class SportsmanA1 extends Members {
    int hightofjump = 8;
    int distanceofrun = 100;
    int distanceofswim = 30;
    String name = "SportsmanA1";

    public int[] getteammate() {
        int[] ttc = new int[]{distanceofrun, distanceofswim, hightofjump};
        return ttc;
    }
}
