package Java230317.src;

public class Car1 {
    private String model;
    private String color;
    private int speed;

   
    private int id;
    static int numbers = 0; 
    public Car1(String m, String c, int s){
        model = m;
        color = c;
        speed = s;
        id = ++numbers;
    }
}
