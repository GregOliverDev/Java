package models;

public class ReportCSV implements iReport {

    @Override
    public void generateReport(String text) {
        System.out.println("Gerando CSV!!");
        System.out.println("Conteudo: " + text);
    }
}
