package figures;

import figures.figure.*;

import java.util.Random;

public class Generator {

    private static Random random = new Random();

    public static void generate() {
        int max = 20;
        int min = 1;
        int figuresNumber = random.nextInt((max - min) + 1) + min;
        for (int i = 0; i < figuresNumber; i++) {
            defineFigure().draw();
        }
    }

    private static Figure defineFigure() {
        switch (random.nextInt(4)) {
            case 0: return Square.generate();
            case 1: return Circle.generate();
            case 2: return Triangle.generate();
            case 3: return Trapezium.generate();
            default: return null;
        }
    }

}
