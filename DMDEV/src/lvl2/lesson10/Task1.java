package lvl2.lesson10;
/*
1. �������� ��� �������� ������ :( � ������ �� �������:)
 */
public class Task1 {
    public static void main(String[] args) {
        String value = "asdfdg :( sfahduf :( auhfsid :)";
        String result = replace(value);
        System.out.println(result);
    }
    public static String replace(String value){
        return  value.replace(":(", ":)");
    }

}
