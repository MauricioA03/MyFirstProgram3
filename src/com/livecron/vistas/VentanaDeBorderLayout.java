package com.livecron.vistas;

import javax.swing.*;
import java.awt.*;

public class VentanaDeBorderLayout extends JFrame {

    public VentanaDeBorderLayout() {
        super("Ventana de borderlayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregarComponentesDeBotones();
        pack();
        setVisible(true);
    }

    private void agregarComponentesDeBotones() {
        JButton button1 = new JButton("Button 1 PAGE START");
        add(button1, BorderLayout.PAGE_START);

        JButton button2 = new JButton("Button 2 CENTER");
        button2.setPreferredSize(new Dimension(300, 200));
        add(button2, BorderLayout.CENTER);

        JButton button3 = new JButton("Button 3 LINE START");
        add(button3, BorderLayout.LINE_START);

        JButton button4 = new JButton("Button 4 PAGE END");
        add(button4, BorderLayout.PAGE_END);

        JButton button5 = new JButton("Button 5 LINE END");
        add(button5, BorderLayout.LINE_END);
    }
}
