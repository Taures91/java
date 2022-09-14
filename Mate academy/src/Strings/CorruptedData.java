package Strings;
/*
А зараз навчимося знаходити зайві символи в рядку, а також переводити рядок у нижній регістр.
Нещодавно ми під'єднали базу даних і отримуємо з неї інформацію в наступному вигляді: data=value.
Але, останнім часом, у значенні value літери стоять то в верхньому, то в нижньому регістрі...
У результаті виходить не значення, а чортзна-що
Ми створили метод getValue(), який приймає рядок dataFromDatabase у вигляді data=value.
Твоє завдання: прибрати з рядку data та =, а потім повернути value у нижньому регістрі.
Будь уважним, бо value в собі теж може містити символ =.
Наприклад:
getValue("name=joHN"); // "john"
getValue("occupation=DeveLOPeR"); // "developer"
getValue("language=JAVA"); // "java"
getValue("login=Me=cOol!!1"); // "me=cool!!1"

 */
public class CorruptedData {
    public static void main(String[] args) {
        System.out.println(getValue("VlAfFaadfDD"));
    }
    public static String getValue(String dataFromDatabase) {
        int indexOf = dataFromDatabase.indexOf('=');
        String substring = dataFromDatabase.substring(indexOf + 1);
        String lowerCase = substring.toLowerCase();
        return lowerCase;
    }
}
