package solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class SumArea {
    private List<Shape> shapes;
    private int sum;

    public SumArea(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public int sumArea(List<Shape> shapes){
        for (Shape shape : shapes) {
           sum +=shape.AreaFigure(shape);
        }
        return sum;
    }

}
