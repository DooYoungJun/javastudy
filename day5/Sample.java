package day5;

public class Sample {
	
		public Sample() {
			System.out.println("콘스트럭트");
		}
		public void foo() {
			System.out.println("인스턴트");
		}
		public static void bar() {
			System.out.println("뭔메소드");
		}
		public static void main(String[] args) {
			Sample i = new Sample();
			i.foo();
			i.bar();
			Sample.bar();
			bar();
			System.gc();
	}

}
