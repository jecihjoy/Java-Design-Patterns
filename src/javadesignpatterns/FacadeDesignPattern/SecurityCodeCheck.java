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
public class SecurityCodeCheck {
    
    public int securitycode = 2524;
    
    public int getSecurityCode() {
        return securitycode;
    }
    
    public boolean isCodeCorrect(int secCode){
        if(secCode == getSecurityCode()) {
            return true;
        }else {
            return false;
        }
    }
}
