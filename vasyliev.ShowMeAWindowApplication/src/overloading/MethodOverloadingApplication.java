package overloading;

public class MethodOverloadingApplication {
    public static void main(String[] args) {
        MyClass objA = new MyClass();
        MyClass objB = new MyClass();

        objA.set(100);
        objA.set('A');
        System.out.println("Об'єкт objA");
        objA.show();

        objB.set();
        objB.show("Об'єкт objB");
        objB.set(200,'B');
        System.out.println("Об'єкт objB після змін: ");
        objB.show("Число", "Символ");

    }
}
