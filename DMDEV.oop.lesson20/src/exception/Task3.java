package exception;
/*
3. СОздать собственный клас-исключение - наследник ласса Exception. создать метод, выбрасывающий это исключение.
Вызвать этот метод и отловить исключение. Вывести stack traсe в консоль.
 */
public class Task3 {

    public static void main(String[] args) {
        try {
            unsafe();
        } catch (DmdevException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void unsafe() throws DmdevException {
        throw new DmdevException("Test exception");
    }
}
