package oop.lesson2;

public class Computer {
     int ssd = 500;
     int ram;
     Computer(){
          System.out.println("Я был создан");
     }

     Computer(int newSSD) {
          ssd = newSSD;
     }
     Computer(int newSSD, int newRAM) {
          ssd = newSSD;
          ram = newRAM;
     }

     void load(){
          System.out.println("Я загрузился");
     }
     void printState() {
          System.out.println("SSD: " + ssd);
          System.out.println("RAM: " + ram);
          System.out.println();
     }
}
