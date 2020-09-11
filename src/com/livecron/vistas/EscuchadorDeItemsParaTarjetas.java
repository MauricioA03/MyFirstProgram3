package com.livecron.vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EscuchadorDeItemsParaTarjetas implements ItemListener {

    private JPanel panelDeTarjetas;

    public EscuchadorDeItemsParaTarjetas(JPanel panelDeTarjetas) {
        this.panelDeTarjetas = panelDeTarjetas;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        CardLayout cardLayout = (CardLayout) panelDeTarjetas.getLayout();
        cardLayout.show(panelDeTarjetas, (String) itemEvent.getItem());
    }
}
