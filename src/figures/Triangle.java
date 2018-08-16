package figures;

import java.util.Random;

public class Triangle extends Figure {

    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(Color color, double aSide, double bSide, double cSide) {
        super(color);
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    @Override
    public double getSquare() {
        double halfPerimeter = (aSide + bSide + cSide)/2;
        return Math.sqrt(halfPerimeter
                * (halfPerimeter - aSide)
                * (halfPerimeter - bSide)
                * (halfPerimeter - cSide)
        );
    }

    @Override
    public void draw() {
        String type = "Type: triangle";
        String square = "square: " + getSquare();
        String lines = "sides: (" + aSide + ", " + bSide + ", " + cSide + ")";
        String color = "color: " + getColor();

        System.out.println(type + ", " + square + ", " + lines + ", " + color + ";");
    }

    public static Triangle generate() {
        Random random = new Random();
        double aSide = random.nextDouble()*20;
        double bSide = random.nextDouble()*20;
        double cSide = random.nextDouble()*20;

        while (!isTriangle(aSide, bSide, cSide)) {
            aSide = random.nextDouble()*20;
            bSide = random.nextDouble()*20;
            cSide = random.nextDouble()*20;
        }

        return new Triangle(Color.generateColor(), aSide, bSide, cSide);
    }

    private static boolean isTriangle(double aSide, double bSide, double cSide) {
        return aSide + bSide > cSide && aSide + cSide > bSide && cSide + bSide > aSide;
    }
}
