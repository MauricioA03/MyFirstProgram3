package com.livecron.vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaDeGridLayout extends JFrame {

    public VentanaDeGridLayout() {
        super("Ventana de Grid Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        incializarLayoutYAgregarComponentes(getContentPane());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void incializarLayoutYAgregarComponentes(Container contentPane) {
        GridLayout layoutDeBotones = new GridLayout(3, 2);
        JPanel panelDeBotones = new JPanel();
        panelDeBotones.setLayout(layoutDeBotones);
        panelDeBotones.add(new JButton("boton 1"));
        panelDeBotones.add(new JButton("boton 2"));
        panelDeBotones.add(new JButton("boton 3"));
        panelDeBotones.add(new JButton("boton de nombre largo 4"));
        panelDeBotones.add(new JButton("5"));
        panelDeBotones.setPreferredSize(new Dimension(150*2+40, 25*4+80));
        contentPane.add(panelDeBotones, BorderLayout.NORTH);

        JPanel panelDeAplicarEspaciado = new JPanel();
        panelDeAplicarEspaciado.setLayout(new GridLayout(2, 3));
        panelDeAplicarEspaciado.add(new JLabel("Espacio horizontal:"));
        panelDeAplicarEspaciado.add(new JLabel("Espacio vertical:"));
        panelDeAplicarEspaciado.add(new JLabel(" "));

        String[] listaDeEspacio = {"0", "10", "20", "30", "40", "50"};
        JComboBox horizontalComboBox = new JComboBox(listaDeEspacio);
        JComboBox verticalComboBox = new JComboBox(listaDeEspacio);
        panelDeAplicarEspaciado.add(horizontalComboBox);
        panelDeAplicarEspaciado.add(verticalComboBox);

        JButton aplicarEspacio = new JButton("Aplicar espacio");
        aplicarEspacio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String espacioHorizonal = (String) horizontalComboBox.getSelectedItem();
                String espacioVertical = (String) verticalComboBox.getSelectedItem();

                layoutDeBotones.setHgap(Integer.parseInt(espacioHorizonal));
                layoutDeBotones.setVgap(Integer.parseInt(espacioVertical));

                layoutDeBotones.layoutContainer(panelDeBotones);
            }
        });
        panelDeAplicarEspaciado.add(aplicarEspacio);
        contentPane.add(new JSeparator(), BorderLayout.CENTER);
        contentPane.add(panelDeAplicarEspaciado, BorderLayout.SOUTH);
    }
}
