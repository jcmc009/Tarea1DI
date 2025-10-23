/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea01_JCMC_2025;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author José Carlos Manjón Carrasco
 */
public class ValidacionesGroupButton implements ActionListener {

    private final ButtonGroup buttonGroup;


    ValidacionesGroupButton(ButtonGroup buttonGroup) {
        this.buttonGroup = buttonGroup;

    }

    public ButtonGroup getGrupo() {
        return buttonGroup;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (buttonGroup.getSelection() == null) {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar una opción de garantía." ,
                    "Validación de campos",
                    JOptionPane.WARNING_MESSAGE
            );

        }

    }

}
