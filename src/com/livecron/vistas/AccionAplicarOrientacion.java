package com.livecron.vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class AccionAplicarOrientacion extends AbstractAction {
    private JPanel panelDeBotones;
    private ButtonGroup buttonGroup;

    public AccionAplicarOrientacion(JPanel panelDeBotones, ButtonGroup buttonGroup) {
        this.panelDeBotones = panelDeBotones;
        this.buttonGroup = buttonGroup;
        putValue(Action.ACTION_COMMAND_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_A, Event.CTRL_MASK));
        putValue(Action.SMALL_ICON, new ImageIcon("/folder/testing/icono.ico"));
    }

    @Override
    public void actionPerformed(ActionEvent eventoDeAccion) {
        String comando = buttonGroup.getSelection().getActionCommand();

        if (comando.equals("Izq a der")) {
            panelDeBotones.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        } else if (comando.equals("Der a izq")) {
            panelDeBotones.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        panelDeBotones.validate();
        panelDeBotones.repaint();
    }
}
