package exception;
/*
2. Ќаписать код, который создаст, а затем отловит ArrayIndeOutOfBoundsException.
 */
public class Task2 {
    public static void main(String[] args) {

        int[] value = {1, 4, 6, 7, 8};
//        System.out.println(value[5]);

        try {
            for (int i = 0; i <= value.length; i++) {
                System.out.println(value[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("catch");
            e.printStackTrace();
        }

    }
}
