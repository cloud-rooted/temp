import java.awt.*;
import java.awt.event.*;

public class RegForm extends Frame {

    RegForm() {
        setTitle("Registration");
        setSize(300, 250);
        setLayout(new GridLayout(5, 2));

        add(new Label("Name"));
        add(new TextField());

        add(new Label("Email"));
        add(new TextField());

        add(new Label("Gender"));
        Panel p = new Panel();
        CheckboxGroup cg = new CheckboxGroup();
        p.add(new Checkbox("Male", cg, false));
        p.add(new Checkbox("Female", cg, false));
        add(p);

        add(new Label("Course"));
        Choice ch = new Choice();
        ch.add("Java"); ch.add("Python"); ch.add("C++");
        add(ch);

        add(new Button("Register"));

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new RegForm();
    }
}
