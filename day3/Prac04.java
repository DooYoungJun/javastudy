package day3;  	

import java.util.Scanner;

public class Prac04 {

	public static void main(String[] args) {

//		int i = 1;
//		int sum = 0;
//		
//		while (i < 101) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input num");
		
		String input = sc.next();
	
		while(!input.equals("0")) {
				System.out.println(input + "입력했습니다.");
				System.out.println("0 을 입력하면 종료");
				System.out.println("input menu");
				input = sc.next();
		}
		System.out.println("프로그램 종료");
	}

}
