package javadesignpatterns.FacadeDesignPattern;

/**
 *
 * @author developer
 */
public class AccountNumberCheck {
    
    private int accountNumber = 34567890;
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public boolean isAccountActive(int accountCheck) {
        if(accountCheck == getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }
    
}
