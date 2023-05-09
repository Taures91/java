package exception;
/**5. Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное,
 * указав в качестве причины отловленное.
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
