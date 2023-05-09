package privateExample;

public class UsingPrivateMembersDemo {
    public static void main(String[] args) {
        MyClass objA = new MyClass("Alpha");
        MyClass objB = new MyClass("Bravo");
        MyClass objC = new MyClass("Charlie");

        objA.show();
        objB.show();
        objC.show();

        objB.set("ƒругий об'Їкт");
        objB.show();


    }
}
