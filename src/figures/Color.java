package figures;

import java.util.Random;

public enum Color {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    INDIGO,
    VIOLET,
    PURPLE,
    PINK,
    SILVER,
    GOLD,
    BROWN,
    GREY,
    BLACK,
    WHITE;

    public static Color generateColor() {
        int max = values().length;
        int randIndex = new Random().nextInt(max);
        return values()[randIndex];
    }
}
