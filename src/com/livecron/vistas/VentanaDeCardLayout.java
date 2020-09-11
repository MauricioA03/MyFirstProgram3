package com.livecron.vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class VentanaDeCardLayout extends JFrame {

    private JPanel panelDeTarjetas;

    public VentanaDeCardLayout() {
        super("Ejemplo de Card Layout");
        panelDeTarjetas = new JPanel(new CardLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarVentanaParaCardLayout();
        setVisible(true);
        pack();
    }
    public void inicializarVentanaParaCardLayout() {
        JPanel comboBoxPanel = new JPanel();
        String[] listaDeComboBox = {"Tarjeta con JButtons", "Tarjeta con JTextField"};
        JComboBox comboBox = new JComboBox(listaDeComboBox);
        comboBox.setEditable(false);
        comboBox.addItemListener(new EscuchadorDeItemsParaTarjetas(panelDeTarjetas));
        comboBoxPanel.add(comboBox);

        JPanel panelDeJButtons = new JPanel();
//        JButton button = new JButton("Boton 1");
//        button.setBackground(Color.PINK);
//        button.setForeground(Color.CYAN);
        panelDeJButtons.add(new JButton("Boton 1"));
        panelDeJButtons.add(new JButton("Boton 2"));
        panelDeJButtons.add(new JButton("Boton 3"));
//        panelDeJButtons.setBackground(Color.BLACK);

        JPanel panelDeTextField = new JPanel();
        panelDeTextField.add(new JTextField("Campo de text", 30));

        panelDeTarjetas.add(panelDeJButtons, "Tarjeta con JButtons");
        panelDeTarjetas.add(panelDeTextField, "Tarjeta con JTextField");

        getContentPane().add(comboBoxPanel, BorderLayout.PAGE_START);
        getContentPane().add(panelDeTarjetas, BorderLayout.CENTER);
    }
}
