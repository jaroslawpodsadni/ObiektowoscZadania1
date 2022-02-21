package swing1;

import javax.swing.*;
import java.awt.*;

public class HelloComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        g.drawString("Hello World", 20,30);
    }
}
