package day6;

public class Car {

    // 변수 생성
    private String Engine;
    private String door;
    private String wheel;
    private String mirror;
    private int price;

    // 매개변수가 있는 생성자 costommixed
    public Car(String Engine, String door, String wheel, String mirror, int price) {
        this.Engine = Engine;
        this.door = door;
        this.wheel = wheel;
        this.mirror = mirror;
        this.price = price;
    }

    // 기본 생성자
    public Car() {

    }
    //get set쓰는 이유 
    public String getEngine() {
		return Engine;
	}

	public void setEngine(String engine) {
		Engine = engine;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getWheel() {
		return wheel;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public String getMirror() {
		return mirror;
	}

	public void setMirror(String mirror) {
		this.mirror = mirror;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 각 속성을 출력하는 메서드
    public void printEngine() {
        System.out.println("Engine: " + Engine);
    }

    public void printDoor() {
        System.out.println("Door: " + door);
    }

    public void printWheel() {
        System.out.println("Wheel: " + wheel);
    }

    public void printMirror() {
        System.out.println("Mirror: " + mirror);
    }

    public void printPrice() {
        System.out.println("Price: " + price);
    }
}