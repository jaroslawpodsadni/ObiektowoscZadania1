package swing1;

import javax.swing.*;
import java.awt.*;

public class Ramka {
    public static void main(String[] args) {
        System.out.println("start");
        EventQueue.invokeLater(() -> {
            MojeOkno mojeOkno = new MojeOkno();
            mojeOkno.setVisible(true);
        });
        System.out.println("koniec");
    }
}
