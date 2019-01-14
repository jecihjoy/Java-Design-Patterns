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
// With an Abstract Factory Pattern you won't
// just build ships, but also all of the components
// for the ships
// Here is where you define the parts that are required
// if an object wants to be an enemy ship
public interface EnemyShipFactory {

    public ESWeapon addESGun();

    public ESEngine addESEngine();

}
