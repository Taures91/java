package overloading;

public class MethodOverloadingApplication {
    public static void main(String[] args) {
        MyClass objA = new MyClass();
        MyClass objB = new MyClass();

        objA.set(100);
        objA.set('A');
        System.out.println("��'��� objA");
        objA.show();

        objB.set();
        objB.show("��'��� objB");
        objB.set(200,'B');
        System.out.println("��'��� objB ���� ���: ");
        objB.show("�����", "������");

    }
}
