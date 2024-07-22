package day5;

public class Test2 {

	private String startEngine;

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.color = "Red";
		myCar.model = "Avante";
		myCar.startEngine();
		myCar.stopEngine();

	}

}
