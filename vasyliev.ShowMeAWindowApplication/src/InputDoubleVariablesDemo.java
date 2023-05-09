import javax.swing.*;

public class InputDoubleVariablesDemo {
    public static void main(String[] args) {
        double mass, height, bmi;
        String result;
        result = JOptionPane.showInputDialog("Ваш зріст у метрах: ");
        mass = Double.parseDouble(result);
        result = JOptionPane.showInputDialog("Ваша вага в кілограмах: ");
        height = Double.parseDouble(result);
        bmi = mass/height/height;
        bmi = Math.round(bmi * 1000000);
        JOptionPane.showMessageDialog(
                null,
                "Індекс маси тіла: " + bmi
        );
    }
}
