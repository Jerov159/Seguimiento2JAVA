package Usuario;

import java.util.Scanner;

public class PrincipalUser {
    private int password;
    public static void main(String[] args) {
            Usuario user = new Usuario();
            Scanner lector = new Scanner(System.in);
            System.out.println("Insert you username: ");
            user.BaseUser = lector.next();
            System.out.println("Insert your password:");
            user.Passwordentered = lector.nextInt();
            System.out.println(user.allowAccess());
    }
}
