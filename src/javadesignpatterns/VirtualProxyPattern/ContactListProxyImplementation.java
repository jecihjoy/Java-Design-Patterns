/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.VirtualProxyPattern;

import java.util.List;

/**
 *
 * @author developer
 */
public class ContactListProxyImplementation implements ContactList {

    private ContactList contactList;

    @Override
    public List<Employee> getEmployeeList() {
        if (contactList == null) {
            System.out.println("Creating contact list and fetching list of employees...");
            contactList = new ContactListImplementation();
        }
        return contactList.getEmployeeList();
    }

}
