/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.RemoteProxyPattern;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/**
 *
 * @author developer
 */
public class ReportGeneratorImplementation extends UnicastRemoteObject implements  ReportGenerator{

    private static final long serialVersionUID = 3107413009881629428L;
    
    protected ReportGeneratorImplementation () throws RemoteException {
        
    }
    
    @Override
    public String generateReport() throws RemoteException {
        StringBuilder sb = new StringBuilder();
        sb.append("********************Location X Daily Report********************" );
        sb.append("\\n Location ID: 012");
        sb.append("\\n Today’s Date: "+new Date());
        sb.append("\\n Total Pizza’s Sell: 112");
        sb.append("\\n Total Price: $2534");
        sb.append("\\n Net Profit: $1985");
        sb.append("\\n ***************************************************************");
        
        return sb.toString();
    }
    public static void main(String[] args) {
        
        try{
            ReportGenerator reportGenerator = new ReportGeneratorImplementation();
            Naming.rebind("ReportGenerator", reportGenerator);
        }catch (Exception exception) {
            exception.printStackTrace();
        }
        
    }
    
    
}

