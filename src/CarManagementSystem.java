import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CarManagementSystem extends Frame {
    public CarManagementSystem() {
        JFrame frame = new JFrame("Car Management System");
        frame.setSize(600, 300);
        frame.setLayout(new FlowLayout());

        JPanel panel1 = new JPanel(new GridLayout(1, 2));
        panel1.add(new JLabel("Car ID:"));
        panel1.add(new JTextField(10));

        JPanel panel2 = new JPanel(new GridLayout(1, 2));
        panel2.add(new JLabel("Serial Number:"));
        panel2.add(new JTextField(10));

        JPanel panel3 = new JPanel(new GridLayout(1, 2));
        panel3.add(new JLabel("Disable the Car ID's JTextField's editability"));
        panel3.add(new JTextField(10));

        JPanel panel4 = new JPanel(new GridLayout(1, 2));
        panel4.add(new JLabel("Car Make:"));
        panel4.add(new JTextField(10));

        JPanel panel5 = new JPanel(new GridLayout(1, 2));
        panel5.add(new JLabel("Car Model:"));
        panel5.add(new JTextField(10));

        JPanel panel6 = new JPanel(new GridLayout(1, 2));
        panel6.add(new JLabel("Colour:"));
        panel6.add(new JTextField(10));

        JPanel panel7 = new JPanel(new GridLayout(1, 2));
        panel7.add(new JLabel("Year:"));
        panel7.add(new JTextField(10));

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);
        frame.add(panel7);

        JButton saveButton = new JButton("Save");
        JButton searchButton = new JButton("Search");
        JButton deleteButton = new JButton("Delete");
        JButton exitButton = new JButton("Exit");

        frame.add(saveButton);
        frame.add(searchButton);
        frame.add(deleteButton);
        frame.add(exitButton);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CarManagementSystem();
    }
}
