package solid;

import solid.lsp.Rectangle;
import solid.lsp.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,4);
        rectangle.setSideA(4);
        rectangle.setSideB(4);
        Square square = new Square(5);
        System.out.printf("В прямоугольнике сторона A = %d, сторона B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        new ViewShape(rectangle).showArea();
        System.out.printf("В квадрате сторона A = %d, сторона B = %d\n", square.getSide(), square.getSide());
        new ViewShape(square).showArea();


    }
}
