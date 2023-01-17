package solid;

import solid.dip.*;

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        report.calculate();
        new ReportManager(new PrintReport()).output(report.getItems());
        new ReportManager(new DisplayReport()).output(report.getItems());
    }
}
