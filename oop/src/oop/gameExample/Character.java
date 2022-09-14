package oop.gameExample;

public class Character {
    public String attackType;
    public int healthPoints;
    public int manaPoints;
    public int attackAmount;
    public int healAmount;
    public String playerClass;

    public Character(String attackType, int healthPoints, int manaPoints, int attackAmount) {
        this.attackType = attackType;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.attackAmount = attackAmount;
    }
    public void restoreHealth(int amount){
        this.healthPoints += amount;
    }
    public void reduceHealth(int amount){
        this.healthPoints -= amount;
    }
    public void restoreMana(int amount){
        this.manaPoints += amount;
    }
    public void reduceMana(int amount){
        this.manaPoints -= amount;
    }

    public void attack (Character c){
        c.reduceHealth(this.attackAmount);
        System.out.println(this.playerClass + " attacked " + c.playerClass + " for " + this.attackAmount);
    }

    public void heal (Character a){
        a.restoreHealth(this.healAmount);
        System.out.println(this.playerClass + " healed " + a.playerClass + " for " + this.healAmount);
    }

    public void info(){
        System.out.println("HP: " + this.healthPoints);
        System.out.println("MP: " + this.manaPoints);
    }

}
