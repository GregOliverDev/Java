package factory;

import models.ReportCSV;
import models.ReportExcel;
import models.iReport;

public class FactoryCSV extends ReportFactory{

    @Override
    public iReport generateReport() {
        return new ReportCSV();
    }
}
