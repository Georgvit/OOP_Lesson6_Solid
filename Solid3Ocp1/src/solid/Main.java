package solid;

import solid.ocp.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Circle(5));
        SumArea sumArea = new SumArea(shapes);

        double sum = sumArea.sumArea(shapes);
        System.out.printf("Сумма площадей фигур равна %f \n", sum);
    }
}
