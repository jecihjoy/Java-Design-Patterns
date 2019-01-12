package javadesignpatterns.ProtectionProxyPattern;

/**
 *
 * @author developer
 */
public class TestProtectionProxy {

    public static void main(String[] args) {
        Manager manager = new Manager();
        ReportGeneratorProxy reportGenerator = new ReportGeneratorProtectionProxy(manager);
        manager.setReportGenerator(reportGenerator);
        Employee employee = new Employee();
        reportGenerator = new ReportGeneratorProtectionProxy(employee);
        employee.setReportGenerator(reportGenerator);
        System.out.println("For owner:");
        System.out.println(manager.generateDailyReport());
        System.out.println("For employee:");
        System.out.println(employee.generateDailyReport());
    }
}
