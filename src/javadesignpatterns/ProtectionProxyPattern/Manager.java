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
public class Manager implements Staff{
    
    private ReportGeneratorProxy generatorProxy;

    @Override
    public boolean isOwner() {
        return true;
    }

    @Override
    public void setReportGenerator(ReportGeneratorProxy protectionProxy) {
        this.generatorProxy = protectionProxy;
    }
    
     public String generateDailyReport() {
        try {
            return generatorProxy.generateDailyReport();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    
}
