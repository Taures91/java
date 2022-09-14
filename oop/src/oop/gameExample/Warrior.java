package oop.gameExample;

public class Warrior extends Character {
    public Warrior(String attackType, int healthPoints, int manaPoints, int attackAmount) {
        super(attackType, healthPoints, manaPoints, attackAmount);
        this.playerClass = "Warrior";
    }


    
}
