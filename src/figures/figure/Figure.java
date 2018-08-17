package figures.figure;

import figures.Color;

public abstract class Figure {

    public Figure(Color color) {
        this.color = color;
    }

    private Color color;

    public Color getColor() {
        return color;
    }

    public abstract double getSquare();

    public abstract void draw();

}
