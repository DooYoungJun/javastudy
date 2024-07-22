package day7;

public class Pet {
	private String name;
	private int age;
	private String bDay;
	private String type;
	private boolean isHinin;
	
	public Pet(String name, int age, String bDay, String type, boolean isHinin) {
		this.name = name;
		this.age = age;
		this.bDay = bDay;
		this.type = type;
		this.isHinin = isHinin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getbDay() {
		return bDay;
	}

	public void setbDay(String bDay) {
		this.bDay = bDay;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isHinin() {
		return isHinin;
	}

	public void setHinin(boolean isHinin) {
		this.isHinin = isHinin;
		if (isHinin) {
			System.out.println("done");
		} else {
			System.out.println("nope");
		}
	}
}

