package factory;

import models.ReportExcel;
import models.ReportPDF;
import models.iReport;

public class FactoryPDF extends ReportFactory{

    @Override
    public iReport generateReport() {
        return new ReportPDF();
    }
}
