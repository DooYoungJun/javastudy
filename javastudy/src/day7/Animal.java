package day7;

public class Animal {

	private int foot;
	private int hand;
	private float speed;
	private String type;

	public Animal() {
		
	}
	
	public Animal(String type) {
		if(type.equals("tiger")) {
			this.foot = 4;
			this.hand = 0;
			this.speed = 70;
			this.type = type;
		} else if (type.equals("bird")) {
			this.foot = 2;
			this.hand = 0;
			this.speed = 55.4f;
			this.type = type;
		} else {
			System.out.println("not a animal.");
		}
	}

	public int getFoot() {
		return foot;
	}

	public void setFoot(int foot) {
		this.foot = foot;
	}

	public int getHand() {
		return hand;
	}

	public void setHand(int hand) {
		this.hand = hand;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}
