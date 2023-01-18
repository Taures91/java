package DMDEV.src.lvl2.lesson2;

public class Computer {

    private int ssd = 500;
    private int ram;

    Computer(){
        System.out.println("Я был создан");
    }
    Computer(int newSsd){
        ssd = newSsd;
    }

    Computer(int newSsd, int newRam){
        ssd = newSsd;
        ram = newRam;
    }

    void load() {
        System.out.println("Я загрузился");
    }
    void load(boolean open) {
        System.out.println("Я загрузился");
        if (open){
            System.out.println("Я открыл крышку");
        }
    }

    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
    }
}
