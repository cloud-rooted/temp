import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener {

    MouseEventDemo() {
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setVisible(true);

        addMouseListener(this);   // Register mouse listener
    }

    // Mouse clicked
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    // Mouse pressed
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    // Mouse released
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    // Mouse entered
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    // Mouse exited
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
