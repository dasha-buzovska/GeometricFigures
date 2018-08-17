package figures.figure;

import figures.Color;

import java.util.Random;

import static figures.figure.Utils.RESET_COLOR;
import static figures.figure.Utils.round;

public class Square extends Figure {

    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getSquare() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        String type = "Type: square";
        String square = "square: " + round(getSquare());
        String side = "side: " + round(this.side);
        String color = "color: " + getColor();

        System.out.println(getColor().getCode()
                + type + ", "
                + square + ", "
                + side + ", "
                + color + ";"
                + RESET_COLOR);
    }

    public static Square generate() {
        return new Square(Color.generateColor(), new Random().nextDouble()*20);
    }

}
