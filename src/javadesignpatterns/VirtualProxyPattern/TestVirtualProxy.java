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
public class TestVirtualProxy {

    public static void main(String[] args) {
        ContactList contactList = new ContactListProxyImplementation();
        Company company = new Company("ABC Company", "India", "+91-011-28458965", contactList);

        System.out.println("Company Name: " + company.getCompanyName());
        System.out.println("Company Address: " + company.getCompanyAddress());
        System.out.println("Company Contact No.: " + company.getCompanyContactNo());
        System.out.println("Requesting for contact list");

        contactList = company.getContactList();

        List<Employee> emps = contactList.getEmployeeList();
        for (Employee e : emps) {
            System.out.println(e);
        }
    }

}
