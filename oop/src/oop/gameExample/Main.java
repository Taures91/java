package oop.gameExample;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("melee",500, 100, 10);
        warrior.info();
        Mage mage = new Mage("ranged", 300, 400, 50);
        warrior.attack(mage);
        Archer archer = new Archer("ranged", 400, 100, 60);
        archer.healAmount = 5;
        archer.heal(warrior);

        Potion hp = new Potion("health", 500, "minor", "blue");
        System.out.println(hp);
                
    }
}
