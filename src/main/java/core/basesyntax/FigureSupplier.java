package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 20;
    private static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(5); // 5 фігур
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                double radius = 1 + random.nextInt(MAX_SIZE);
                return new Circle(color, radius);
            case 1:
                int side = 1 + random.nextInt(MAX_SIZE);
                return new Square(color, side);
            case 2:
                int width = 1 + random.nextInt(MAX_SIZE);
                int height = 1 + random.nextInt(MAX_SIZE);
                return new Rectangle(color, width, height);
            case 3:
                int triSide = 1 + random.nextInt(MAX_SIZE);
                return new RightTriangle(color, triSide);
            default:
                int base1 = 1 + random.nextInt(MAX_SIZE);
                int base2 = 1 + random.nextInt(MAX_SIZE);
                int trapHeight = 1 + random.nextInt(MAX_SIZE);
                return new IsoscelesTrapezoid(color, base1, base2, trapHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", DEFAULT_RADIUS);
    }
}
