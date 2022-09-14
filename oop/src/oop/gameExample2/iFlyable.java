package oop.gameExample2;

public interface iFlyable {
    void fly();
    default void    hover(){
        System.out.println("I`m hovering");
    }
}
