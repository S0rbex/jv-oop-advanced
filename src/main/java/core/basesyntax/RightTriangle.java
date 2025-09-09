package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double calculateFigureArea() {
        return (side * side * Math.sqrt(3)) / 4;
    }

    @Override
    public void drawFigure() {
        System.out.println("Right RightTriangle");
    }
}
