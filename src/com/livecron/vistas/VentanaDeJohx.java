package com.livecron.vistas;

import javax.swing.*;
import java.awt.*;

public class VentanaDeJohx extends JFrame {

    public VentanaDeJohx() {
        super("Ventana de JOhx");
        inicializarVentanaLosComponentes();
        mostrarVentana();
    }

    private void mostrarVentana() {
        setVisible(true);
    }

    private void inicializarVentanaLosComponentes() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setOpaque(true);
        menuBar.setBackground(new Color(141, 34, 180));
        menuBar.setPreferredSize(new Dimension(500, 50));

        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(23, 120, 105));
        label.setForeground(new Color(153, 16, 56));
        label.setPreferredSize(new Dimension(500, 300));

        setJMenuBar(menuBar);
        getContentPane().add(label, BorderLayout.CENTER);

        pack();
    }
}
