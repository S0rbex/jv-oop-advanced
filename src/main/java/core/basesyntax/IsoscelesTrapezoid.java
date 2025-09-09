package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int diagonal1;
    private int diagonal2;
    private double sin;

    public IsoscelesTrapezoid(String color, int diagonal1, int diagonal2, double sin) {
        super(color);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sin = sin;
    }

    public int getDiagonal1() {
        return diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    @Override
    public double calculateFigureArea() {
        return 0.5 * diagonal1 * diagonal2 * sin;
    }

    @Override
    public void drawFigure() {
        System.out.println("Drawing IsoscelesTrapezoid");
    }
}
