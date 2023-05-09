package privateExample;

public class MyClass {
    private static int count = 0;
    private int number;
    private String name;

    public MyClass(String n) {
        count++;
        name = n;
        number = count;
        System.out.println("Створено об'єкт з іменем " + name);
    }

    public void show(){
        System.out.println("Назва об'єкта: " + name);
        System.out.println("Номер об'єкта: " + number);
        System.out.println("Кількість об'єктів: " + count);
    }

    public void set (String n){
        name = n;
    }
}
