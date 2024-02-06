package Prestamolibro;

import javax.swing.text.StyledEditorKit;
import java.time.LocalDate;

public class Prestamo {
    public int loanCode;
    public LocalDate loanDate; //Cuando se programe marcara la fecha de prestamo actual
    public String bookName;
    public int userCode;
    public int loanDays;
    public boolean loanStatus; //Verdadero o falso si esta disponible

    public void checkLoanStatus() {
        if (!loanStatus) {
            loanStatus = true;
            loanDate = LocalDate.now();
            System.out.println("Book '" + bookName + "' has been loaned.");
        } else {
            System.out.println("Book is already loaned.");
        }
    }
    // Method to get loan details
    public String getLoanDetails() {
        return "Book: " + bookName + "\nLoan Code: " + loanCode + "\nLoan Date: " + loanDate;
    }
}
