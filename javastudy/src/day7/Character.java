package day7;

public class Character {
	
	private String name;
	private String type;
	private int level;
	private double gold;
	
	public Character() {
		
	}
	
	public Character(String type) {
		if(type.equals("minsu")) {
			this.name = "minsu";
			this.type = "solider";
			this.level = 30;
			this.gold = 10000;
		} else if (type.equals("youngho")) {
			this.name = "youngho";
			this.type = "wizard";
			this.level = 100;
			this.gold = 50000;
		} else {
			System.out.println("not in users");
		}
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getGold() {
		return gold;
	}
	public void setGold(double gold) {
		this.gold = gold;
	}

}
