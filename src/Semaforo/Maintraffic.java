package Semaforo;

public class Maintraffic {
    public static void main(String[] args) {
        Trafficlight trafficlight = new Trafficlight();

        trafficlight.cambiarColor();
        System.out.println("Color actual del semáforo: " + trafficlight.colorBombilla);
    }
    }
