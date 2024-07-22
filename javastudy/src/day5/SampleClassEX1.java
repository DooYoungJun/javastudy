package day5;

public class SampleClassEX1 {

	private int value = 0;
	private static int num = 0;
	
	public static void main(String[] args) {

		public SampleClassEX1(int value) {
			this.value = value;
			num++;
		}
		public void SampleClassEx01() {
			this(100);
		}
		public static int getNumberOfInstance() {
			return num;
		}
		public int getValue() {
			return this.value;
	}

}
