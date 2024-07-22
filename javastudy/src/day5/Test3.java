package day5;

public class Test3 {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.name = "SiBa";
		dog1.age = 3;
		
		Dog dog2 = new Dog();
		dog2.name = "ChiWaWa";
		dog2.age = 5;
		
		dog1.bark();
		dog1.displayAge();
		dog2.bark();
		dog2.displayAge();
	}

}
