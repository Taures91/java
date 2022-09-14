package oop.gameExample;

public class Archer extends Character {
    public Archer(String attackType, int healthPoints, int manaPoints, int attackAmount) {
        super(attackType, healthPoints, manaPoints, attackAmount);
        playerClass = "Archer";
    }
}
