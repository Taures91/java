package oop.lesson3;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Taures", 15, "mage");
        Player player1 = player;
        player1.name = "Taures91";
        System.out.println("Player name: " + player1.name);
        System.out.println("Level: " + player1.level);
        System.out.println("Player class: " + player1.playerClass);
        Player player2 = new Player ("Cooler");
        player.info();
        System.out.println("Players count: " + Player.playersCount);
        Player.info(player2);

    }
}
