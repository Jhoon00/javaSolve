package Java230317.src;

public class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2("S600", "White", 80); 
        Car2 c2 = new Car2("E500", "Blue", 20); 
        int n = Car2.getNumberOfCars();
        System.out.println("지금까지 생성된 자동차 수 = " + n);
    }
}
