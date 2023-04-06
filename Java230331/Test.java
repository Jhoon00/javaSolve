package Java230331;

import Java230331.test.Circle;
import Java230331.test.Rectangle;
import Java230331.test.Shape;
import Java230331.test.Triangle;

public class Test {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();

        s = new Rectangle();
        s.draw();

        s = new Triangle();
        s.draw();

        s = new Circle();
        s.draw();
    }
}