package chusang;

abstract class Shape {
    private int x, y;

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("도형을 [ " + x + ", " + y + " ] 로 이동합니다");
    }

    public abstract void draw();
};

class Cricle extends Shape {
    private int radius;

    public void draw() {
        System.out.println("원 그리기 메소드");
    }
}