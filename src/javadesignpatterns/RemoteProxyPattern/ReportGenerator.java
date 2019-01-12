/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.RemoteProxyPattern;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author developer
 */
public interface ReportGenerator extends Remote{
    
    public String generateReport()throws RemoteException;
    
}
