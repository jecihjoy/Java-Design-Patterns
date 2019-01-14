package javadesignpatterns.FacadeDesignPattern;

/**
 *
 * @author developer
 */
public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountNumberCheck;
    SecurityCodeCheck securityCodeCheck;
    FundsCheck fundsCheck;
    WelcomeToBank welcomeToBank;

    public BankAccountFacade(int accNumb, int secCode) {
        accountNumber = accNumb;
        securityCode = secCode;

        welcomeToBank = new WelcomeToBank();
        fundsCheck = new FundsCheck();
        securityCodeCheck = new SecurityCodeCheck();
        accountNumberCheck = new AccountNumberCheck();
    }

    public int getAccNumber() {
        return accountNumber;
    }

    public int getSecNumber() {
        return securityCode;
    }

    public void depositCash(double amount) {
        if (accountNumberCheck.isAccountActive(getAccNumber())
                && securityCodeCheck.isCodeCorrect(getSecNumber())) {
            fundsCheck.depositCash(amount);
            System.out.println("Transaction Complete");
        } else {
            System.out.println("Transaction Failed\n");
        }

    }

    public void withdrawCash(double amount) {
        if (accountNumberCheck.isAccountActive(getAccNumber())
                && securityCodeCheck.isCodeCorrect(getSecNumber())
                && fundsCheck.haveEnoughMoney(amount)) {

            fundsCheck.withdrawCash(amount);
            System.out.println("Transaction Complete");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }
}
