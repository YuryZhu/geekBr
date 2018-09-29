package ru.yzhiharevich.geekb;

public class OldLady extends Members {
    int hightofjump = 2;
    int distanceofrun = 8;
    int distanceofswim = 5;
    String name = "OldLady";

    public int[] getteammate() {
        int[] ttc = new int[]{distanceofrun, distanceofswim, hightofjump};
        return ttc;
    }
}
