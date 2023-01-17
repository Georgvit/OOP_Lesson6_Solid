package solid.dip;

import java.util.List;

public class DisplayReport implements OutputReport{

    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to display");
        for (ReportItem item : items) {
            System.out.format("Display output %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
