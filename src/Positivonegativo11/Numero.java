package Positivonegativo11;

public class Numero {
    int numero1;
    public String numero2() {
        if (numero1 > 0) {
            return "positivo";
        } else if (numero1 < 0) {
            return "negativo";
        } else {
            return "cero";
        }
    }
}

