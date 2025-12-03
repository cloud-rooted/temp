import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener {

    String msg = "";

    MouseEventDemo() {
        addMouseListener(this);
        setSize(300, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString(msg, 20, 80);
    }

    public void mouseClicked(MouseEvent e) {
        msg = "Mouse Clicked";
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        msg = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        msg = "Mouse Released";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        msg = "Mouse Entered Frame";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        msg = "Mouse Exited Frame";
        repaint();
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
