package usingAbstractClassApplication;

public class UsingAbstractClassDemo {
    public static void main(String[] args) {
        // Створення об?єктів:
        Triangle T=new Triangle("червоний",2); // Трикутник
        Square S=new Square("чорний",3);       // Квадрат
        Circle C=new Circle("жовте",1);        // Коло
        // Відображення інформації про об?єкти через
        // об?єктні змінні підкласів:
        System.out.println(
                "Використання об?єктних змінних підкласу");
        T.show();
        S.show();
        C.show();
        // Об?єктна змінна абстрактного суперкласу:
        ColoredFigure F;
        // Відображення інформації про об?єкти через
        // об?єктну змінну абстрактного суперкласу:
        System.out.println(
                "Використання об?єктної змінної абстрактного суперкласу");
        F=T;      // Трикутник
        F.show();
        F=S;      // Квадрат
        F.show();
        F=C;      // Коло
        F.show();
    }
}
