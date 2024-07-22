package day7;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {

	public static void main(String[] args) {
		
		List <Animal> animalList = new ArrayList<>();
		
		Animal tiger = new Animal("tiger");
		Animal bird = new Animal("bird");
		
		animalList.add(tiger);
		animalList.add(bird);
		
		for(Animal animal : animalList) {
			System.out.println(animal.getType());
			System.out.println(animal.getFoot());
			System.out.println(animal.getHand());
			System.out.println(animal.getSpeed());
		
			System.out.println(animal);
		}
	}

}
