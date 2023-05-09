package lesson18.weapon;

import lesson18.weapon.RangeWeapon;

public class Bow implements RangeWeapon {
    @Override
    public int getDamage() {
        return 10;
    }
}
