package lesson19.person;

public class PersonExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Ivan", "Ivanov");
//        Person petr = new Person(2, "Petr", "Petrov");

        System.out.println(ivan.hashCode());
        System.out.println(petr.hashCode());
// equals по всем трем полям объекта
        System.out.println(ivan.equals(petr));

    }
}
