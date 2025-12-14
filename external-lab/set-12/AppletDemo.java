// will not run as applet is removed from JAVA from versions 11 onwards 

import java.applet.*;
import java.awt.*;

/* 
  <applet code="AppletDemo.class" width="300" height="200"></applet> 
*/

public class AppletDemo extends Applet {

    public void paint(Graphics g) {
        g.drawString("Welcome to Java Applet", 50, 50);
    }
}
