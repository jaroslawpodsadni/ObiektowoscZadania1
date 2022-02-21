package swing1;

import javax.swing.*;
import java.awt.*;

public class MojeOkno extends JFrame {
    public MojeOkno() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension rozmiarEkranu = toolkit.getScreenSize();
        setTitle("Moje pierwsze okienko");
        setBounds(600 ,500 ,rozmiarEkranu.width / 2, rozmiarEkranu.height / 2); //rozmiar i pozycja startowa
        setResizable(false);
        getContentPane().setBackground(Color.GRAY);
        getContentPane().setForeground(new Color(145,200,144));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //getContentPane().add(new HelloComponent());
        //getContentPane().add(new FiguryComponent());
        getContentPane().add(new Figury2dComponent());
    }

}
