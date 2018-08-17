package figures.figure;

import figures.Color;

import java.util.Random;
import static figures.figure.Utils.RESET_COLOR;
import static figures.figure.Utils.round;

public class Circle extends Figure {

    private Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getLength() {
        return Math.PI * radius * 2;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        String type = "Type: circle";
        String square = "square: " + round(getSquare());
        String radius = "radius: " + round(getRadius());
        String length = "length: " + round(getLength());
        String color = "color: " + getColor();

        System.out.println(getColor().getCode()
                + type + ", "
                + square + ", "
                + radius + ", "
                + length + ", "
                + color + ";"
                + RESET_COLOR);
    }

    public static Circle generate() {
        return new Circle(Color.generateColor(), new Random().nextDouble()*20);
    }

}
