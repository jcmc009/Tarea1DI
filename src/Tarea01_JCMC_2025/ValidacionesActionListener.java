/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea01_JCMC_2025;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
  * @author José Carlos Manjón Carrasco
 */
public class ValidacionesActionListener implements ActionListener {

    private final JTextField campo;
    private final String nombreCampo;
    //private final JTextArea jTextAreaDescripcionDetallada;

    public ValidacionesActionListener(JTextField campo, String nombreCampo) {
        this.campo = campo;
        this.nombreCampo = nombreCampo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String texto = campo.getText().trim();

        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "El campo '" + nombreCampo + "' no puede estar vacío.",
                    "Validación de campos",
                    JOptionPane.WARNING_MESSAGE
            );

        } else {
            // Aquí continuar con la lógica si el campo es válido
            //  System.out.println("Campo '" + nombreCampo + "' validado correctamente: " + texto);
        }
    }
}
