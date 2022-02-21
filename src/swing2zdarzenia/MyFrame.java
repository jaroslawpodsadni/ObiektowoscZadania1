package swing2zdarzenia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.Scanner;

public class MyFrame extends JFrame {

    private JPanel panel;

    public MyFrame() {
        setTitle("Zdarzenia");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        JButton button = new JButton("Zmień kolor tła");
        button.addActionListener(this::changeColor);

        panel.add(button);
        add(panel);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("Czy zamknac program?");
                Scanner scanner = new Scanner(System.in);
                String znak = scanner.nextLine();
            }
        });
    }



    private void changeColor(ActionEvent e) {
        System.out.println("Zostałem klikniety");
        Random random = new Random();
        panel.setBackground(new Color(random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255)));
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setVisible(true);
    }

}

