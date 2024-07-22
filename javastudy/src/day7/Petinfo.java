package day7;

import java.util.ArrayList;
import java.util.List;

public class Petinfo {


	public static void main(String[] args) {
		List <Pet> petList = new ArrayList<>();
		
		Pet a = new Pet(null, 0, null, null, false);
		a.setName("zindo");
		a.setAge(5);
		a.setbDay("20190505");
		a.setType("犬");
		a.setHinin(true);
		
		petList.add(a);
		
		for(Pet pet1 : petList) {
			System.out.println(pet1.getName() + "の情報です。");
			System.out.println("種類: " + pet1.getType() + "です。");
			System.out.println("年: " + pet1.getAge());
			System.out.println("誕生日: " + pet1.getbDay());
			System.out.println("中性花: " + pet1.isHinin());
			System.out.println();
		}
	}
}
