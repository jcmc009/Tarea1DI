/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea01_JCMC_2025;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author José Carlos Manjón Carrasco
 */
public class SalirActionListener implements ActionListener {

 

    @Override
    public void actionPerformed(ActionEvent e) {
            int opcion = JOptionPane.showConfirmDialog(
                null,
                "¿Desea salir sin guardar?",
                "Confirmación de salida",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (opcion == JOptionPane.YES_OPTION) {

            setVisible(false); // cerramos modal

        } else {

            //  aquí se cierra formulario 
        }
    
    }
}
