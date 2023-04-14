package Java230413;

public class Car {
    String brand;
    String model;

    public Car() {
        this("Unknown", "Unknown");
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Car == false) {
            return false;
        }
        Car yourCar = (Car) obj;
        if (yourCar.brand.equals(brand) && yourCar.model.equals(model)) {
            return true;
        }
        return false;
    }
}
