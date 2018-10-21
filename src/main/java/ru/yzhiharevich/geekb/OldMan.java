package ru.yzhiharevich.geekb;

public class OldMan extends Members {
    int hightofjump = 10;
    int distanceofrun = 20;
    int distanceofswim = 10;
    String name = "OldMan";

    public int[] getteammate() {
        int[] ttc = new int[]{distanceofrun, distanceofswim, hightofjump};
        return ttc;
    }
}
