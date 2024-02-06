package Reclamo9;

import javax.swing.*;

public class Reclamo {
    public static void main(String[] args) {
        // Crear un reclamo
        MainReclamo miReclamo = new MainReclamo(123, "","", "");

        // Mostrar mensaje de recepción
        miReclamo.nombrePersona() = JOptionPane.showInputDialog("Enter the person's name: ");
        miReclamo.asunto = JOptionPane.showInputDialog("Enter the subject of the claim: ");
        miReclamo.descripcionReclamo = JOptionPane.showInputDialog("Enter the description of the claim: ");
        JOptionPane.showMessageDialog(null, "Your claim has been successful with the name: " + MainReclamo.nombrePersona + " with the subject: " + MainReclamo.asunto + " with the claim number: ");
    }
}

