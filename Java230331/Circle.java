package Java230331;

import Java230331.test.Shape;

public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle Draw[" + radius + "]");
    }
}
