/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.VirtualProxyPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author developer
 */
public class ContactListImplementation implements ContactList {

    @Override
    public List<Employee> getEmployeeList() {
        List<Employee> empList = new ArrayList<Employee>(5);
        empList.add(new Employee("Employee A", 2565.55, "SE"));
        empList.add(new Employee("Employee B", 22574, "Manager"));
        empList.add(new Employee("Employee C", 3256.77, "SSE"));
        empList.add(new Employee("Employee D", 4875.54, "SSE"));
        empList.add(new Employee("Employee E", 2847.01, "SE"));
        return empList;

    }

}
