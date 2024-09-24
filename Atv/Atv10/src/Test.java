import factory.FactoryCSV;
import factory.FactoryExcel;
import factory.FactoryPDF;
import services.ReportService;

public class Test {
    public static void main(String[] args) {
        ReportService reportService = new ReportService();
        reportService.generate(new FactoryPDF(), "Ola documento teste PDF");
        reportService.generate(new FactoryCSV(), "Ola documento teste CSV");
        reportService.generate(new FactoryExcel(), "Ola documento teste Excel");
    }
}