package javadesignpatterns.ProtectionProxyPattern;

import java.rmi.Naming;

/**
 *
 * @author developer
 */
public class ReportGeneratorProtectionProxy implements ReportGeneratorProxy {

    ReportGeneratorProxy reportGenerator;
    Staff staff;

    public ReportGeneratorProtectionProxy(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String generateDailyReport() {
        if (staff.isOwner()) {
            ReportGeneratorProxy reportGenerator = null;
            try {
                reportGenerator = (ReportGeneratorProxy) Naming.lookup("rmi://127.0.0.1/PizzaCoRemoteGenerator");
                return reportGenerator.generateDailyReport();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "";
        } else {
            return "Not Authorized to view report.";
        }
    }
}
