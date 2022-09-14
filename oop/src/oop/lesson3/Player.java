package oop.lesson3;

public class Player {
    public String name;
    public int level;
    public String playerClass;
    public static int playersCount;
    public Player(String name, int level, String playerClass) {
        this.name = name;
        this.level = level;
        this.playerClass = playerClass;
        playersCount++;
    }

    public Player(String name) {
        this.name = name;
        playersCount++;
    }

    public Player(int level) {
        this.level = level;
        playersCount++;
    }


    public void info (){
        System.out.println("Player info: " + this.name + " " + this.level + "lvl, " + this.playerClass);
    }
    public static void info (Player player){
        System.out.println("Player info: " + player.name + " " + player.level + "lvl, " + player.playerClass);
    }
}
