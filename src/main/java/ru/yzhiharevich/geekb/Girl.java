package ru.yzhiharevich.geekb;

public class Girl extends Members {
    int hightofjump = 3;
    int distanceofrun = 10;
    int distanceofswim = 3;
    String name = "Girl";

    public int[] getteammate() {
        int[] ttc = new int[]{distanceofrun, distanceofswim, hightofjump};
        return ttc;
    }
}
