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
public class UFOBossEnemyShip extends EnemyShip {

    // We define the type of ship we want to create
    // by stating we want to use the factory that 
    // makes enemy ships
    EnemyShipFactory shipFactory;

    // The enemy ship required parts list is sent to 
    // this method. They state that the enemy ship
    // must have a weapon and engine assigned. That 
    // object also states the specific parts needed
    // to make a Boss UFO versus a Regular UFO
    public UFOBossEnemyShip(EnemyShipFactory shipFactory) {

        this.shipFactory = shipFactory;

    }

    // EnemyShipBuilding calls this method to build a 
    // specific UFOBossEnemyShip
    void makeShip() {

        // TODO Auto-generated method stub
        System.out.println("Making enemy ship " + getName());

        // The specific weapon & engine needed were passed in
        // shipFactory. We are assigning those specific part
        // objects to the UFOBossEnemyShip here
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();

    }

}
