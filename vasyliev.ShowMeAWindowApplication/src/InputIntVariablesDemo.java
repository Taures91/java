import javax.swing.*;

public class InputIntVariablesDemo {
    public static void main(String[] args) {
        int age,year,birth;
        String result;
        result = JOptionPane.showInputDialog("який зараз р≥к?");
        year = Integer.parseInt(result);
        result = JOptionPane.showInputDialog("—к≥льки вам рок≥в?");
        age = Integer.parseInt(result);
        birth = year - age;
        JOptionPane.showMessageDialog(
                null,
                "¬и народились у " + birth + " роц≥"
        );
    }
}
