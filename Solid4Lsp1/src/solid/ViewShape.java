package solid;

import solid.lsp.Figure;
import solid.lsp.Rectangle;

public class ViewShape {
    private Figure figure;

    public ViewShape(Figure figure) {
        this.figure = figure;
    }

    public void showArea() {
        System.out.print("Площадь фигуры равна:");
        System.out.println(figure.getArea());
    }
}
