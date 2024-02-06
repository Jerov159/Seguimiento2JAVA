package Prestamolibro;

import java.util.Scanner;

public class PrincipalPrestamo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter loan days: ");
        int loanDays = scanner.nextInt();

        System.out.print("Enter user code: ");
        int userCode = scanner.nextInt();

        System.out.print("Enter loan code: ");
        int loanCode = scanner.nextInt();

    }
}


