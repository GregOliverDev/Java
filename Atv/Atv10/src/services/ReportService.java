package services;

import factory.ReportFactory;
import models.iReport;

public class ReportService {
    public void generate(ReportFactory reportFactory, String text) {
        iReport report = reportFactory.generateReport();
        report.generateReport(text);
    }
}
