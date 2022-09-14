package oop.gameExample2;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();{
            dragon.attack();
        }
        iFlyable flyable = new Dragon();
        iFlyable flyable2 = new Bird();
        iFlyable[] flyers = new iFlyable[2];
        flyers[0] = flyable;
        flyers[1] = flyable2;
        for (int i = 0; i < flyers.length; i++) {
            flyers[i].fly();
        }


    }
}
