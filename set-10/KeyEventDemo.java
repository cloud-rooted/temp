import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame implements KeyListener {

    KeyEventDemo() {
        setSize(400, 300);
        setTitle("Key Event Demo");
        setLayout(null);
        setVisible(true);

        addKeyListener(this);   // Register KeyListener
        setFocusable(true);     // Component must be focusable
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyEventDemo();
    }
}
