package figures;

public abstract class Figure {

    public Figure(Color color) {
        this.color = color;
    }

    private Color color;

    public String getColor() {
        return color.name();
    }

    public abstract double getSquare();

    public abstract void draw();

}
