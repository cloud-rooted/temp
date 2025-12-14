import java.awt.*;
import java.awt.event.*;

public class AdapterDemo extends Frame {

    AdapterDemo() {
        setSize(300, 300);
        setTitle("Adapter Class Demo");

        // Add MouseListener using Adapter
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {   // override only one method
                System.out.println("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new AdapterDemo();
    }
}
