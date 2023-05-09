package lvl2.lesson10;
/*
3. �������� �������, ����������� � �������� ����������� ���, ������� � �������� � ������������
�������� � ������� "�.�.�". ������, ��� ������� ��������� ����� ���� � ����� ��������, � �������������� ������ ������ ����
� �������.
 */
public class Task3 {
    public static void main(String[] args) {
        String result1 = format1("���������", "��������", "�����������");
        String result2 = format2("���������", "��������", "�����������");
        String result3 = format3("���������", "��������", "�����������");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
    public static String format1 (String firstName, String lastName, String patronymicName){
        char firstNameChar = firstName.toUpperCase().charAt(0);
        char lastNameChar = lastName.toUpperCase().charAt(0);
        char patronymicNameChar = patronymicName.toUpperCase().charAt(0);
        return firstNameChar + "." + lastNameChar + "." + patronymicNameChar + ".";
    }

    public static String format2 (String firstName, String lastName, String patronymicName){
        char firstNameChar = firstName.charAt(0);
        char lastNameChar = lastName.charAt(0);
        char patronymicNameChar = patronymicName.charAt(0);
        return String.format("%s.%s.%s.", firstNameChar, lastNameChar, patronymicNameChar);
    }
    public static String format3 (String firstName, String lastName, String patronymicName){
        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));
        return String.format("%s.%s.%s.", firstNameChar, lastNameChar, patronymicNameChar);
    }
}
