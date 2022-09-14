package oop.gameExample;

public class Mage extends Character {
    public Mage(String attackType, int healthPoints, int manaPoints, int attackAmount) {
        super(attackType, healthPoints, manaPoints, attackAmount);
        this.playerClass = "Mage";
    }
}
