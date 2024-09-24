package models;

public class ReportPDF implements iReport{

    @Override
    public void generateReport(String text) {
        System.out.println();
        System.out.println("Gerando PDF!!");
        System.out.println("Conteudo: " + text);
    }
}
