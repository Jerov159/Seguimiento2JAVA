package Ejercicio10;

public class Calcular10 {
    public String name;
    public int hoursAmount;
    public int salary;
    public int rateWork;

    public int hours() {
        if (hoursAmount <= 10) {
            salary = hoursAmount * rateWork;
        } else {
            salary = 10 * rateWork + (hoursAmount - 10) * 33000;
        }
        return hoursAmount;
    }
}