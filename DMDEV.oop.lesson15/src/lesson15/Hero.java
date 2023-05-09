package lesson15;

import lesson18.weapon.Weapon;

public abstract class Hero<T extends Weapon> {

    private String name;
    private int damage;
    private T weapon;


    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return name;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public T getWeapon() {
        return weapon;
    }
    public int getDamage() {
        return damage;
    }
}
