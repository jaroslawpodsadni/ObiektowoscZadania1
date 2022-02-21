package swing1;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Observer;

public class Figury2dComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.drawString("Hello World", 20,30);
        Point point1 = new Point(100,100);
        Point point2 = new Point(500,200);

        Dimension dimension = new Dimension(300,300);

        graphics2D.setPaint(Color.MAGENTA);
        Line2D line2d = new Line2D.Double(point1,point2);
        graphics2D.draw(line2d);
        graphics2D.setPaint(Color.PINK);

        Rectangle rectangle = new Rectangle(point1,dimension);
        graphics2D.draw(rectangle);

        Ellipse2D ellipse2D = new Ellipse2D.Double(100,100,200,200);
        graphics2D.fill(ellipse2D);
        graphics2D.setPaint(Color.BLACK);
        ellipse2D.setFrame(rectangle);
        graphics2D.draw(ellipse2D);

        Image image = new ImageIcon("E:\\bank_logo.jpg").getImage();
        graphics2D.drawImage(image, 400,100, null);

    }
}
