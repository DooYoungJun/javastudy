package day3;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		
// 문제 5번		
		for (int i = 1; i <=100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				 System.out.println(i);
			}
		}
		
// 문제 4번

		float num1 = 10.5f;
		float num2 = 5.5f;
		
		int intNum1 = (int)num1;
		int intNum2 = (int)num2;
		
		int result = intNum1 + intNum2;
		System.out.println("결과는 " + result);


//// 문제 3번
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		int number = sc.nextInt();
		
		if (number % 2 ==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		
// 문제 2번
		int[] numbers = {1,2,3,4,5};
		int[] doubledNumbers = new int[numbers.length];
		
		
		for (int i = 0; i < numbers.length; i++) {
			doubledNumbers[i] = numbers[i] *2;
		}
	
		for (int num : doubledNumbers) {
			System.out.println(num);
		}
	
	while switch if 문제 2개 만들어서 풀어서 오기 
// 문제 1번
		
//		int i = 1;
//		while (i<11) {
//			System.out.println(i);
//			i++;
//		}
//	}

}
