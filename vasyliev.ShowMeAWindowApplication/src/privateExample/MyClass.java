package privateExample;

public class MyClass {
    private static int count = 0;
    private int number;
    private String name;

    public MyClass(String n) {
        count++;
        name = n;
        number = count;
        System.out.println("�������� ��'��� � ������ " + name);
    }

    public void show(){
        System.out.println("����� ��'����: " + name);
        System.out.println("����� ��'����: " + number);
        System.out.println("ʳ������ ��'����: " + count);
    }

    public void set (String n){
        name = n;
    }
}
