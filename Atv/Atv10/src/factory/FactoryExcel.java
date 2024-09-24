package factory;

import models.ReportExcel;
import models.iReport;

public class FactoryExcel extends ReportFactory{

    @Override
    public iReport generateReport() {
        return new ReportExcel();
    }
}
