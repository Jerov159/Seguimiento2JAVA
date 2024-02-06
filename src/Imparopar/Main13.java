package Imparopar;

import javax.swing.*;

public class Main13 {
    public static void main(String[] args) {
        Ejerc13 ejerc13 = new Ejerc13();
        ejerc13.number1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
        JOptionPane.showConfirmDialog(null, ejerc13.calc());
    }
}
