package constuctors;

public class UsingConstructorDemo {
    public static void main(String[] args) {
        MyClass objA = new MyClass();
        MyClass objB = new MyClass(200, 'B');
        System.out.println("��'��� objA");
        objA.show();
        System.out.println("��'��� objB");
        objB.show();
    }
}
