import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingRegistrationForm extends JFrame {

    SwingRegistrationForm() {

        setTitle("Registration Form");
        setSize(350, 300);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Name"));
        add(new JTextField());

        add(new JLabel("Email"));
        add(new JTextField());

        add(new JLabel("Gender"));
        JPanel p = new JPanel();
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);
        p.add(r1); p.add(r2);
        add(p);

        add(new JLabel("Course"));
        JComboBox<String> cb = new JComboBox<>();
        cb.addItem("Java");
        cb.addItem("Python");
        cb.addItem("C++");
        add(cb);

        add(new JButton("Register"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingRegistrationForm();
    }
}
