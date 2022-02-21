package swing1;

import javax.swing.*;
import java.awt.*;

public class FiguryComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        g.drawString("Hello World", 20,30);
        g.drawLine(10,50,150,70);
        g.drawRect(10,80,50,60);
        g.drawArc(10,100, 300,300, 0,180);
        g.draw3DRect(50,130, 400,300,true);
        g.drawOval(80,100,300,300);
    }
}
