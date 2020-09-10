package com.livecron.vistas;

import javax.swing.*;
import java.awt.*;

public class VentanaDeBoxLayout extends JFrame {

    public VentanaDeBoxLayout() {
        super("Ventana de Box Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        incializarLayoutYAgregarComponentes();
        pack();
        setVisible(true);
    }

    private void incializarLayoutYAgregarComponentes() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        agregarBoton("Button 1", getContentPane());
        agregarBoton("Button 2", getContentPane());
        agregarBoton("Button 3", getContentPane());
        agregarBoton("Long Named Button 4", getContentPane());
        agregarBoton("5", getContentPane());

    }
    public void agregarBoton(String text, Container panel) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(button);
    }
}
