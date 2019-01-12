/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.ProtectionProxyPattern;

/**
 *
 * @author developer
 */
public interface Staff {
    
    public boolean isOwner();
    public void setReportGenerator(ReportGeneratorProxy protectionProxy);
}
