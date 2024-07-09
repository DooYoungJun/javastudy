package day5;

class Car extends Test2{
	
	String color;
	String model;
	
	void startEngine() {
		System.out.println(color + " " + model + " Engine Started");
	}
	
	void stopEngine() {
		System.out.println(color + " " + model + " Engine Stopped");
	}
}
