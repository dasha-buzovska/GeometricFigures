package figures.figure;

public class Utils {

    public static final String RESET_COLOR = "\033[0m";

    public static double round(double number) {
        return (double)Math.round(number * 10) / 10;
    }
}
