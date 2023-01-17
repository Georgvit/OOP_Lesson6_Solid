package solid.dip;

import java.util.List;

public class ReportManager {
    OutputReport outputReport;

    public ReportManager(OutputReport outputReport) {
        this.outputReport = outputReport;
    }

    public void output(List<ReportItem> items){
        outputReport.output((List<ReportItem>) items);
    }
}
