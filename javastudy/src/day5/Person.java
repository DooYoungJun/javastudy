package day5;

public class Person {
	public String name = "John Doe";
	
	public int age = 30;
	
	public void Method1() {
		System.out.println("Public Method 호출됨");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public void Method2() {
		System.out.println("Private Method 호출됨");
	}
}
