package homework;

public class CarTest {
	private int speed;
	private int gear;
	private String color;
	
	public void speedUp(){
		speed++;
	}
	public void speedDown() {
		speed--;
	}
	
	public static void main(String[] args) {
		CarTest myCar = new CarTest();
		myCar.speedUp();
		System.out.println(myCar.speed);
	}

}
