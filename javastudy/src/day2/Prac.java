package day2;

import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 7까지 입력");
		
		int dice = sc.nextInt();
		
		System.out.println("마지막눈: "+ dice);
		
		if(1 <= dice && dice <=6) {
			if(dice == 2 || dice == 4 || dice == 6) {
				System.out.println("짝수 입니다.");
			} else {
				System.out.println("홀수 입니다.");
			}
		}else 
		{
			System.out.println("잘못된 수 입니다.");
		}
	}

}
