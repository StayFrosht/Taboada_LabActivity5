package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(e -> {
            try {
                int year = Integer.parseInt(tfYear.getText());
                boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
                JOptionPane.showMessageDialog(null, "The year " + year + " is " + (isLeapYear ? "a leap year." : "not a leap year."));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage());
            }
        });

    }

    public static void main(String[] args) {
        try {
            JFrame frame = new JFrame("Leap Year Checker");
            frame.setContentPane(new LeapYearGUI().panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
    }

}


