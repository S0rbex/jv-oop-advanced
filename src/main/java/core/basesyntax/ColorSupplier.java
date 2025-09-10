package core.basesyntax;

import java.util.Random;
enum Color {
    WHITE, RED, BLUE, GREEN, YELLOW, BLACK, PURPLE;
}
public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
