/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.FacadeDesignPattern;

/**
 *
 * @author developer
 */
public class FundsCheck {

    private double totalCash = 1000.00;

    public double getCashInAcccount() {
        return totalCash;
    }

    public void withdrawCash(double amount) {
        totalCash -= amount;
    }

    public void depositCash(double amount) {
        totalCash += amount;
        System.out.println("Deposit Complete: Current Balance is " + getCashInAcccount());
    }

    public boolean haveEnoughMoney(double cashToWidraw) {
        if (cashToWidraw > getCashInAcccount()) {
            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAcccount());
            return false;
        } else {
            withdrawCash(cashToWidraw);
            System.out.println("Withdrawal Complete: Current balance " + getCashInAcccount());
            return false;
        }
    }
}
