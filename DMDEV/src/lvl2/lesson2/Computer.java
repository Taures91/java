package DMDEV.src.lvl2.lesson2;

public class Computer {

    private int ssd = 500;
    private int ram;

    Computer(){
        System.out.println("� ��� ������");
    }
    Computer(int newSsd){
        ssd = newSsd;
    }

    Computer(int newSsd, int newRam){
        ssd = newSsd;
        ram = newRam;
    }

    void load() {
        System.out.println("� ����������");
    }
    void load(boolean open) {
        System.out.println("� ����������");
        if (open){
            System.out.println("� ������ ������");
        }
    }

    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
    }
}
