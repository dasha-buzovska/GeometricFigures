package figures;

import java.util.Random;

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
        String square = "square: " + (double)Math.round(getSquare() * 10)/10;
        String radius = "radius: " + (double)Math.round(getRadius() * 10)/10;
        String length = "length: " + (double)Math.round(getLength() * 10)/10;
        String color = "color: " + getColor();

        System.out.println(type + ", " + square + ", " + radius + ", " + length + ", " + color + ";");
    }

    public static Circle generate() {
        return new Circle(Color.generateColor(), new Random().nextDouble()*20);
    }
}
