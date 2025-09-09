package core.basesyntax;

import java.util.List;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final List<String> colors = List.of("Red", "Blue", "Yellow", "White", "Purple");

    public String getRandomColor() {
        int index = random.nextInt(colors.size());
        return colors.get(index);
    }
}
