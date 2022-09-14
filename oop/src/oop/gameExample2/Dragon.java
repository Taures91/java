package oop.gameExample2;

public class Dragon extends NPC implements iFlyable{
    @Override
    public void attack() {
        System.out.println("Dragon attacks!");
    }

    @Override
    public void fly() {
        System.out.println("I`m flying!");
    }
}
