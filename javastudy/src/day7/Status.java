package day7;

import java.util.ArrayList;
import java.util.List;

public class Status {

	public static void main(String[] args) {
			
			List <Character> charList = new ArrayList<>();
			
			Character minsu = new Character("minsu");
			Character youngho = new Character("youngho");
			
			charList.add(minsu);
			charList.add(youngho);
			
			for(Character char1 : charList) {
				System.out.println(char1.getName());
				System.out.println(char1.getType());
				System.out.println(char1.getLevel());
				System.out.println(char1.getGold());
				System.out.println();
			}
	}
}

