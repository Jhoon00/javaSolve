package Java230331;

public class Shape {
    private int x, y;

    public void draw() {
        System.out.println("Shape Draw[" + x + ", " + y + "]");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}