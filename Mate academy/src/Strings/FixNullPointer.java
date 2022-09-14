package Strings;
/*
Рано чи пізно в житті настає момент, коли ми маємо зустрітися зі своїм ворогом віч-на-віч.
Для тебе цей момент настав! Перед тобою великий і жахливий NullPointerException - нічний жах усіх програмістів.
Але ж ти знаєш, як його перемогти, чи не так?
Допиши метод getUpperCase() так, щоби він повертав рядок "The string is null!", якщо inputString дорівнює null.
 */
public class FixNullPointer {
    public static void main(String[] args) {
        System.out.println(getUpperCase(""));
    }
    public static String getUpperCase(String inputString) {
        if (inputString == null){
            return "The string is null!";
        }
        return inputString.toUpperCase();
    }
}
