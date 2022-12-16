package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(e -> {
            double number1 = Double.parseDouble(tfNumber1.getText());
            double number2 = Double.parseDouble(tfNumber2.getText());
            String operation = (String) cbOperations.getSelectedItem();
            double result = 0;
            switch (operation) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    result = number1 / number2;
                    break;
            }

            lblResult.setText(String.valueOf(result));
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setContentPane(new SimpleCalcGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
