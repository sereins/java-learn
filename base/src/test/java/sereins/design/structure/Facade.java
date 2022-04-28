package sereins.design.structure;

import pers.sereins.design.structure.Facade.ReportFacade;

public class Facade {
    public static void main(String[] args) {

        ReportFacade reportFacade = new ReportFacade();

        reportFacade.generateReport();
    }
}
