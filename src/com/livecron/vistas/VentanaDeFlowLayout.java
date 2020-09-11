package com.livecron.vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaDeFlowLayout extends JFrame {

    public VentanaDeFlowLayout() {
        super("Ventana de Flow Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        incializarLayoutYAgregarComponentes();
        pack();
        setVisible(true);
    }

    private void incializarLayoutYAgregarComponentes() {
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.TRAILING);

        JRadioButton radioButtonDeIzqADer = new JRadioButton("Izq a der");
        radioButtonDeIzqADer.setActionCommand("Izq a der");
        radioButtonDeIzqADer.setSelected(true);

        JRadioButton radioButtonDeDerAIzq = new JRadioButton("Der a izq");
        radioButtonDeDerAIzq.setActionCommand("Der a izq");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButtonDeIzqADer);
        buttonGroup.add(radioButtonDeDerAIzq);

        JPanel panelDeBotones = new JPanel(flowLayout);
        JButton button = new JButton("Boton 1");
        button.addActionListener(new AccionAplicarOrientacion(panelDeBotones, buttonGroup));
        panelDeBotones.add(button);
        panelDeBotones.add(new JButton("Boton 2"));
        panelDeBotones.add(new JButton("Boton 3"));
        panelDeBotones.add(new JButton("Boton  mas largo 4"));
        panelDeBotones.add(new JButton("5"));
        panelDeBotones.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);


        JButton botonDeAplicarOrientacion = new JButton("Aplicar orientacion");

        JPanel panelDeControles = new JPanel(new FlowLayout());
        panelDeControles.add(radioButtonDeIzqADer);
        panelDeControles.add(radioButtonDeDerAIzq);
        panelDeControles.add(botonDeAplicarOrientacion);

        botonDeAplicarOrientacion.addActionListener(new AccionAplicarOrientacion(panelDeBotones, buttonGroup));

        add(panelDeBotones, BorderLayout.CENTER);
        add(panelDeControles, BorderLayout.SOUTH);
    }
}
