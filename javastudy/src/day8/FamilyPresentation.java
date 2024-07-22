package day8;

import java.util.ArrayList;
import java.util.List;


public class FamilyPresentation {
	public static void main(String[] args)  {
		
		List <Familyinfo> familyList = new ArrayList<>();
		Familyinfo f1 = new Familyinfo("母", "YoungHEE", "HouseWork", "A", 0, true);
		Familyinfo f2 = new Familyinfo("父", "HEECHUL", "Engineer", "B", 400000, true);
		Familyinfo f3 = new Familyinfo("息子", "CHULSOO", "Student", "AB", 0, false);
		Familyinfo f4 = new Familyinfo("娘", "MINHEE", "Student", "A", 0, false);

		familyList.add(f1);
		familyList.add(f2);
		familyList.add(f3);
		familyList.add(f4);
		
		for(Familyinfo family1 : familyList) {
			System.out.println(family1.getType() + "の情報");
			System.out.println("名前：" + family1.getName());
			System.out.println("職業：" + family1.getJob());
			System.out.println("血液型：" + family1.getBloodType());
			System.out.println("年収：" + family1.getSalary());
			System.out.println("車両保有：" + family1.isHasCar());
			System.out.println();
		}
	}
}
