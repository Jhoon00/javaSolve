package Java230323;

public class SportCar extends Car {
    private boolean turbo;

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public String toString() {
        return "speed[" + getSpeed() + "], turbo[" + isTurbo() + "]";
    }
}