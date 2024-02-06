package Usuario;

public class Usuario {
    public String BaseUser = "Juan Diego";
    public String UserLogin;
    public int Basekey;
    public int Passwordentered = 1590;


    // Constructor
    public String validateStatus() {
        if (this.BaseUser == "Juan Diego") {
            return "Allowed";
        } else {
            return "Not allowed";
        }
    }

    public String allowAccess() {
        if (Passwordentered == 1590) {
            return "Allowed";
        } else {
            return "Not allowed";
        }
    }
}




