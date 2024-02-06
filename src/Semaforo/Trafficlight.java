package Semaforo;

import javax.swing.*;
import java.awt.*;

public class Trafficlight {
    public Color colorBombilla;

    public Boolean onOff = false;

    public void cambiarColor() {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Si desea cambiar el color" +
                "1. Rojo" + "2. Amarillo" + "3. Verde"));

        if (x == 1) {
            this.colorBombilla = Color.RED;

        } else if (x==2) {
            this.colorBombilla = Color.YELLOW;
        }else {
            this.colorBombilla = Color.GREEN;
        }
    }
    public Boolean onOff(){
        return this.onOff = true;
    }
}