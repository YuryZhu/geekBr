package ru.yzhiharevich.geekb;

public class Team {
    OldLady oldLady = new OldLady();
    OldMan oldMan = new OldMan();
    SportsmanA1 sportsmanA1 = new SportsmanA1();
    Boy boy = new Boy();

    public int[][] teammates() {

        int[][] ttc = {oldMan.getteammate(), oldLady.getteammate(), sportsmanA1.getteammate(), boy.getteammate()};
        return ttc;
    }

    public void showTeamMates(String teamname) {
        teamname = "Pobeda";
        System.out.println("The name of the team is " + teamname);
        System.out.println("New Team was created and the new Members are " + oldMan.name + " and "
                + oldLady.name + " and " + sportsmanA1.name + " and " + boy.name);
    }

    public void showresult(int mate) {
        String name = "";
        switch (mate) {
            case (1):
                name = oldMan.name;
                break;
            case (2):
                name = oldLady.name;
                break;
            case (3):
                name = sportsmanA1.name;
                break;
            case (4):
                name = boy.name;
                break;
        }
        System.out.println("The member " + name + " has successful passed the obstacles");
    }
}
