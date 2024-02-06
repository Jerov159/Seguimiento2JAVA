package Arearectangulo;

import java.util.Scanner;

public class Principalarea {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        Areare calculadora = new Areare();

        System.out.print("Ingrese la base del rectángulo: ");
        calculadora.base = lector.nextInt();

        System.out.print("Ingrese la altura del rectángulo: ");
        calculadora.height = lector.nextInt();

        System.out.println("El area es" + calculadora.calcularArea());
    }
}
