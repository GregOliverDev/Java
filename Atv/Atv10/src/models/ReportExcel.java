package models;

public class ReportExcel implements iReport {

    @Override
    public void generateReport(String text) {
        System.out.println();
        System.out.println("Gerando Excel!!");
        System.out.println("Conteudo: " + text);

    }
}