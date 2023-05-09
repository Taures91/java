package lesson18;

import lesson15.Archer;
import lesson15.Hero;
import lesson15.Warrior;
import lesson18.weapon.Bow;
import lesson18.weapon.Sword;
import lesson18.weapon.Weapon;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Боромир", 10);
        warrior.setWeapon(new Sword());

        printWeaponDamage(warrior);
        printWeaponDamage(archer);
    }

    public static <T extends Weapon> void printWeaponDamage (Hero<T> hero){
        System.out.println(hero.getWeapon().getDamage());
    }
}
