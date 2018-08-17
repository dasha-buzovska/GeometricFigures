package figures;

import java.util.Random;

public enum Color {
    RED("\033[0;31m"),
    YELLOW("\033[0;33m"),
    GREEN("\033[0;32m"),
    BLUE("\033[0;34m"),
    PURPLE("\033[0;35m"),
    CYAN("\033[0;36m"),
    BLACK("\033[0;30m");

    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Color generateColor() {
        int max = values().length;
        int randIndex = new Random().nextInt(max);
        return values()[randIndex];
    }

}
