package exception;
/**5. ������� ���� �� ������������ � JDK ����������, �������� ��� � ��������� ��� �����������,
 * ������ � �������� ������� �����������.
 *
 */
public class Task5 {

    public static void main(String[] args) {
        try{
        catchCustomException();
        } catch (DmdevException exception){
            System.out.println("catched in main");
            exception.printStackTrace();
        }
    }

    public static void  catchCustomException (){
        try{
            unsafe();
        } catch (RuntimeException e){
            System.out.println("Catch main");
            throw new DmdevException(e);
        }
    }
    public static void unsafe(){
        throw new RuntimeException("Ooops");
    }
}
