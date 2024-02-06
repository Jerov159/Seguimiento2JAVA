package Positivonegativo11;

import java.util.Scanner;

public class Principalnumero {
    public static void main(String[] args) {
        Numero numero = new Numero();
        Scanner lector = new Scanner(System.in);
        System.out.println("Enter a number:");
        numero.numero1 = lector.nextInt();
        System.out.println("The number entered is " + numero.numero2());
    }
}




