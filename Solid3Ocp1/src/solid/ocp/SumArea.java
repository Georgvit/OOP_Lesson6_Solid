package solid.ocp;

import java.util.List;

public class SumArea {
    private int sum;

    public int sumArea(List<Shape> shapes) {
        for (Shape shape : shapes) {
            sum += shape.AreaFigure(shape);
        }
        return sum;
    }

}
