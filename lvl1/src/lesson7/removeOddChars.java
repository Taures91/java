package lesson7;

public class removeOddChars {
    public static void main(String[] args) {
        System.out.println(removeOddChars("I have learned Java Core!"));
    }
    public static String removeOddChars(String originalString) {
        char[] chars = originalString.toCharArray();
        String str = new String();
        for (int i = 0; i < chars.length; i++){
            if (i % 2 != 0){
                str = str + chars[i];
            }

        }
        return str;
        // write your code above this line
    }
    }



