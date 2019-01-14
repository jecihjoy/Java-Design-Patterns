/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.AbstractFactoryDesignPattern;

/**
 *
 * @author developer
 */
// Any part that implements the interface ESWeapon
// can replace that part in any ship
public interface ESWeapon {

    // User is forced to implement this method
    // It outputs the string returned when the 
    // object is printed
    public String toString();

}
