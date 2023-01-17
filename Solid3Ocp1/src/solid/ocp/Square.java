package solid.ocp;

public class Square  implements Shape {
    private int side;
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double AreaFigure(Shape Shape) {
        return Math.pow(side, 2);
    }
}
