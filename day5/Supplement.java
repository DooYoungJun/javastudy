package day5;

public class Hoge {
	
	int n = 1;
	
	void foor() {
		System.out.println("n=" this.n);
	}
	
	public class Sumpelment {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Hoge h1 = new Hoge();
		Hoge h2 = h1;
		
		h1.n = 3;
		h1.foo();
	
	
	}
	}

}
