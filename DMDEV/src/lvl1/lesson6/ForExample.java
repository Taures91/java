package startlessons.lesson6;
//        for (int value = 10; value > 0; value--) {
//            System.out.println(value);
//        }
//    }

public class ForExample {
    public static void main(String[] args) {
        for (int value = 10; value > 0; value--) {

            if (value == 5) {
                continue;
            }
            System.out.println(value);
        }
    }

    private static void example2() {
        for (int value = 10; value > 0; value--) {
            System.out.println(value);
            if (value == 5) {
                break;
            }
        }
    }


    private static void example() {
        for (int i = 0; i < 13; i++) {
            System.out.println(i);

        }
    }
}
