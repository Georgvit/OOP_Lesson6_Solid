package solid.lsp;

public class Square implements Figure {

    int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(getSide(), 2);
    }
}
