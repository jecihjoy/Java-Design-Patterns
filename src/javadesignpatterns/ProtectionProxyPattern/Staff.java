package javadesignpatterns.ProtectionProxyPattern;

/**
 *
 * @author developer
 */
public interface Staff {
    
    public boolean isOwner();
    public void setReportGenerator(ReportGeneratorProxy protectionProxy);
}
