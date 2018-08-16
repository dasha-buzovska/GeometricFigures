package figures;

import java.util.Random;

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
        String square = "square: " + getSquare();
        String side = "side: " + this.side;
        String color = "color: " + getColor();

        System.out.println(type + ", " + square + ", " + side + ", " + color + ";");
    }


    public static Square generate() {
        return new Square(Color.generateColor(), new Random().nextDouble()*20);
    }
}
