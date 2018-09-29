package ru.yzhiharevich.geekb;

public class App {
    public static void main(String[] args) {
        Course c = new Course(); // Создаем полосу препятствий
        Team team = new Team(); // Создаем команду
        team.showTeamMates("Pobeda");
        c.doIt(); // Просим команду пройти полосу
    }
}
