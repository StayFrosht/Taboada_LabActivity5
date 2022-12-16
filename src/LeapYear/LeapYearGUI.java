package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(e -> {
            int year = Integer.parseInt(tfYear.getText());
            boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
            JOptionPane.showMessageDialog(null, "The year " + year + " is " + (isLeapYear ? "a leap year." : "not a leap year."));
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Leap Year Checker");
        frame.setContentPane(new LeapYearGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


