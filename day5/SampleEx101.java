package day5;

public class SampleEx101 {

	public static void main(String[] args) {
		SampleClassEX1 s1, s2, s3;

		System.out.println("인스턴스 수 : " + SampleClassEX1.getNumberOfInstance());
		s1 = new SampleClassEX1(50);
		s2 = new SampleClassEX1(0);
		
		System.out.println(s1.getValue());
		System.out.println(s2.getValue());
		
		System.out.println("인스턴스 수 : " + SampleClassEX1.getNumberOfInstance());
		s3 = new SampleClassEX1(200);
		System.out.println(s3);
	
	}
}