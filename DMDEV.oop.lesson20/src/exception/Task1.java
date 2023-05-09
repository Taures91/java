package exception;
/*
1. ќбъ€вите переменную со значением null. вызовите метод у этой переменной. ќтловите возникшее исключение
 */
public class Task1 {
    public static void main(String[] args) {
        String value = null;
        try{
        value.length();
        } catch (NullPointerException e){
            System.err.println("catch");
            e.printStackTrace();
        }
    }
}
