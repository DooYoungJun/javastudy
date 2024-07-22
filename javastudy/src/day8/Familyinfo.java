//FamilyInfo.javaを作成
//・type(mother or father or brother or sister)
//・name
//・job
//・bloodType
//・salary
//・hasCar(boolean)
//
//-コンストラクタ作成なし
//
//・４人の家族情報を作成し、以下のように出力する
//
//母の情報
//名前：XXX
//職業：XXX
//血液型：B
//年収：1000万円
//車両保有：あり
//
//父の情報
//・
//・
//・
//・
//・

package day8;

public class Familyinfo {
	private String type;
	private String name;
	private String job;
	private String bloodType;
	private int salary;
	private boolean hasCar;
	
	public Familyinfo(String type, String name, String job, String bloodType, int salary, boolean hasCar) {
		this.type = type;
		this.name = name;
		this.job = job;
		this.bloodType = bloodType;
		this.salary = salary;
		this.hasCar = hasCar;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isHasCar() {
		return hasCar;
	}

	public void setHasCar(boolean hasCar) {
		this.hasCar = hasCar;
		if (true) {
			
		}
	}		
	
}
