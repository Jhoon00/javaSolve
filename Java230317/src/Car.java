package Java230317.src;
public class Car {
    private int speed;
    private String name;

    public Car(){
        System.out.println("속도는 " + speed + "km/h");
    }

    
    {
        speed = 100;
    }

    public Car(String name){
        this.name = name;
        System.out.println("속도는 " + speed + "km/h");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("그랜저");
    }
}
