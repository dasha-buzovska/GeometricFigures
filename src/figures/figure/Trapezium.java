package figures.figure;

import figures.Color;
import java.util.Random;
import static figures.figure.Utils.RESET_COLOR;
import static figures.figure.Utils.round;

public class Trapezium extends Figure {

    private double bottomBase;
    private double topBase;
    private double leftSide;
    private double rightSide;

    public Trapezium(Color color, double bottomBase, double topBase, double leg) {
        super(color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.leftSide = leg;
        this.rightSide = leg;
    }

    @Override
    public double getSquare() {
        return (0.25 * (bottomBase + topBase)/(bottomBase - topBase)
                * Math.sqrt((bottomBase - topBase + leftSide + rightSide)
                * (topBase - bottomBase + leftSide - rightSide)
                * (topBase - bottomBase - leftSide + rightSide))
        );
    }

    public static Trapezium generate() {
        Random random = new Random();
        double leg = random.nextDouble()*20;
        double base1 = random.nextDouble()*20;
        double base2 = random.nextDouble()*20;

        return new Trapezium(Color.generateColor(), Math.max(base1, base2), Math.min(base1, base2), leg);
    }

    @Override
    public void draw() {
        String type = "Type: trapezium";
        String square = "square: " + round(getSquare());
        String lines = "sides: ("
                + round(topBase) + ", "
                + round(leftSide) + ", "
                + round(bottomBase) + ", "
                + round(rightSide) + ")";
        String color = "color: " + getColor();

        System.out.println(getColor().getCode()
                + type + ", "
                + square + ", "
                + lines + ", "
                + color + ";"
                + RESET_COLOR);
    }

}
