import javax.swing.*;

public class InputDoubleVariablesDemo {
    public static void main(String[] args) {
        double mass, height, bmi;
        String result;
        result = JOptionPane.showInputDialog("��� ���� � ������: ");
        mass = Double.parseDouble(result);
        result = JOptionPane.showInputDialog("���� ���� � ���������: ");
        height = Double.parseDouble(result);
        bmi = mass/height/height;
        bmi = Math.round(bmi * 1000000);
        JOptionPane.showMessageDialog(
                null,
                "������ ���� ���: " + bmi
        );
    }
}
