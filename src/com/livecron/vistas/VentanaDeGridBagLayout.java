package com.livecron.vistas;

import javax.swing.*;
import java.awt.*;

public class VentanaDeGridBagLayout extends JFrame {

    public VentanaDeGridBagLayout() {
        super("Ventana de Grid Bag Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        incializarLayoutYAgregarComponentes(getContentPane());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void incializarLayoutYAgregarComponentes(Container panel) {
        panel.setLayout(new GridBagLayout());

        JButton button1 = new JButton("Boton 1");
        GridBagConstraints restriccionesBoton1 = new GridBagConstraints();
        restriccionesBoton1.weightx = 0.5;
        restriccionesBoton1.fill = GridBagConstraints.HORIZONTAL;
        restriccionesBoton1.gridx = 0;
        restriccionesBoton1.gridy = 0;
        panel.add(button1, restriccionesBoton1);

        JButton button2 = new JButton("Boton 2");
        GridBagConstraints restriccionBoton2 = new GridBagConstraints();
        restriccionBoton2.weightx = 0.5;
        restriccionBoton2.fill = GridBagConstraints.HORIZONTAL;
        restriccionBoton2.gridx = 1;
        restriccionBoton2.gridy = 0;
        panel.add(button2, restriccionBoton2);

        JButton button3 = new JButton("Boton 3");
        GridBagConstraints restriccionBoton3 = new GridBagConstraints();
        restriccionBoton3.weightx = 0.5;
        restriccionBoton3.fill = GridBagConstraints.HORIZONTAL;
        restriccionBoton3.gridx = 2;
        restriccionBoton3.gridy = 0;
        panel.add(button3, restriccionBoton3);

        JButton button4 = new JButton("Boton largo nombrado 4");
        GridBagConstraints restriccionesBoton4 = new GridBagConstraints();
        restriccionesBoton4.fill = GridBagConstraints.HORIZONTAL;
        restriccionesBoton4.weightx = 0.0;
        restriccionesBoton4.gridwidth = 3;
        restriccionesBoton4.ipady = 200;
        restriccionesBoton4.gridx = 0;
        restriccionesBoton4.gridy = 1;
        panel.add(button4, restriccionesBoton4);

        JButton button5 = new JButton( "5");
        GridBagConstraints restriccionesBoton5 = new GridBagConstraints();
        restriccionesBoton5.fill = GridBagConstraints.HORIZONTAL;
        restriccionesBoton5.gridwidth = 2;
        restriccionesBoton5.gridx = 1;
        restriccionesBoton5.gridy = 2;
        restriccionesBoton5.ipady = 0;
        restriccionesBoton5.anchor = GridBagConstraints.PAGE_END;
        restriccionesBoton5.insets = new Insets(50, 0, 0, 0);
        panel.add(button5, restriccionesBoton5);
    }
}
