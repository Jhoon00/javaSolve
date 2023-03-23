public class Car {
    private String model;
    private String color;
    private int speed;

        public final static int MAX_SPEED;
    static{
        MAX_SPEED = 350;
        System.out.println("MAX_SPEED가 초기화되었습니다.");
    }


    {
        model = "그랜저";
        color = "흰색";
    }

     private int id;

     private static int numbers = 0;

       public int getNumbers(){
       
        return numbers;
    }
        public void print(){
        System.out.println("하이~~~~~");
    }
    public Car(String m, String c, int s){
        model = m;
        color = c;
        speed = s;
        id = ++numbers; 
    }

    public static void main(String[] args) {
        Car c1, c2, c3;
        c1 = new Car("S600", "white", 80);
        c2 = new Car("E500", "blue", 20);
        c3 = new Car("E300", "gray", 160);

        System.out.println("생성된 자동차 수 : " + c1.getNumbers());
        System.out.println("생성된 자동차 수 : " + c2.getNumbers());
        System.out.println("생성된 자동차 수 : " + c3.getNumbers());

              double d = Math.sqrt(9);
        System.out.println("9의 제곱근 : " + d);

        System.out.println(Car.MAX_SPEED);
    }
}
