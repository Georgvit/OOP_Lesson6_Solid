package solid.ocp;

public class Circle implements Shape {
    private int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

    @Override
    public double AreaFigure(Shape Shape) {
        return Math.PI * Math.pow(rad, 2);
    }
}
