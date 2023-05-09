package constuctors;

public class MyClass {
    int number;
    char symbol;

    MyClass(){
        number = 100;
        symbol = 'A';
    }

    MyClass(int n, char s){
        number = n;
        symbol = s;
    }

    void show (){
        System.out.println("Значення полів " + number + " та " + symbol);
    }
}
