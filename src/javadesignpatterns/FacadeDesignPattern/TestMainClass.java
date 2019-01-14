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
public class TestMainClass {

    public static void main(String[] args) {

        BankAccountFacade accessingBank = new BankAccountFacade(34567890, 2524);

        accessingBank.depositCash(150.00);

        accessingBank.withdrawCash(990.00);

    }
}
