import javax.swing.*;

public class ShowMeNewWindowDemo {
    public static void main(String[] args) {
        String title = "�����������";
        String text = "���������� ������� Java";
        JOptionPane.showMessageDialog(
                null,
                text,
                title,
                JOptionPane.WARNING_MESSAGE
        );
    }
}

//ERROR_MESSAGE
//INFORMATION_MESSAGE
//QUESTION_MESSAGE
//PLAIN_MESSAGE
