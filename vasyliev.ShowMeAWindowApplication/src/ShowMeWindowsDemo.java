import javax.swing.*;

public class ShowMeWindowsDemo {
    public static void main(String[] args) {
        String title;
        String text;
        title = JOptionPane.showInputDialog(
                null,
                "��'� ��� ����: ",
                "�����",
                JOptionPane.WARNING_MESSAGE
        );
        text = JOptionPane.showInputDialog(
                null,
                "����� �����������: ",
                "����",
                JOptionPane.PLAIN_MESSAGE
        );
        JOptionPane.showMessageDialog(
                null,
                text,
                title,
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
