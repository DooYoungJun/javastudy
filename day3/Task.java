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
	}
}
//		
//// 문제 4번
//
//		float num1 = 10.5f;
//		float num2 = 5.5f;
//		
//		int intNum1 = (int)num1;
//		int intNum2 = (int)num2;
//		
//		int result = intNum1 + intNum2;
//		System.out.println("결과는 " + result);
//
//
////// 문제 3번
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 입력해주세요");
//		int number = sc.nextInt();
//		
//		if (number % 2 ==0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
//
//		
//// 문제 2번
//		int[] numbers = {1,2,3,4,5};
//		int[] doubledNumbers = new int[numbers.length];
//		
//		
//		for (int i = 0; i < numbers.length; i++) {
//			doubledNumbers[i] = numbers[i] *2;
//		}
//	
//		for (int num : doubledNumbers) {
//			System.out.println(num);
//		}
//	
//	while switch if 문제 2개 만들어서 풀어서 오기 
//// 문제 1번
//		
////		int i = 1;
////		while (i<11) {
////			System.out.println(i);
////			i++;
////		}
////	}
//
//}
//
//package day1;
//
//import java.util.Scanner;
//
///*出力結果
//☆★☆★☆★☆★☆★☆★☆★☆
//HAPPY BIRTHDAY
//★★★★★★FRIEND☆☆☆☆☆☆
//*/
//
//public class Task {
//    public static void main(String[] args){
//
//        String star = "☆";
//
//        Scanner scanner =new Scanner(System.in);
//
//        System.out.println("名前を入力してください");
//
//        String friendName = scanner.next();
//
//        for(int sum =1 ; sum <=15 ; sum++){
//            //swich文
//            switch (star) {
//                case "☆":
//                 System.out.print(star);
//                 star = "★";
//                 break;
//
//                default:
//                 System.out.print(star);
//                 star = "☆";
//                 break;
//            }
//        }
//        //HAPPY BIRTHDAYを出力
//        System.out.println();
//        System.out.println("HAPPY BIRTHDAY");
//
//        //while文
//        int sum = 0;
//        while (sum < 13) {
//            if(sum >= 0 && sum <= 5){
//                System.out.print(star);
//                star = "★";
//                sum++;
//            }else if(sum >=  7&& sum <= 13){
//                System.out.print(star);
//                sum++;
//            }else{
//                System.out.print(friendName);
//                star = "☆";
//                ;
//            }
//        }
//    }
//}
//
//
//
//
//import java.util.Scanner;
//
//出力結果
//☆★☆★☆★☆★☆★☆★☆★☆
//HAPPY BIRTHDAY
//★★★★★★FRIEND☆☆☆☆☆☆
//
//
//public class Task {
//    public static void main(String[] args){
//
//        String star = "☆";
//
//        Scanner scanner =new Scanner(System.in);
//
//        System.out.println("名前を入力してください");
//
//        String friendName = scanner.next();
//
//        for(int sum = 0; sum <= 14; sum++){
//            //swich文
//            switch (star) {
//                case "☆":
//                 System.out.print(star);
//                 star = "★";
//                 break;
//
//                default:
//                 System.out.print(star);
//                 star = "☆";
//                 break;
//            }
//        }
//        //HAPPY BIRTHDAYを出力
//        System.out.println();
//        System.out.println("HAPPY BIRTHDAY");
//
//        //while文
//        int sum = 0;
//        while (sum < 13) {
//            if(sum >= 0 && sum <= 5){
//                System.out.print(star);
//                star = "★";
//                sum++;
//            }else if(sum >= 7 && sum <= 12){
//                System.out.print(star);
//                //star = "☆";
//                sum++;
//            }else{
//                System.out.print(friendName);
//                star = "☆";
//                sum++;
//            }
//        }
//    }
//}
//
//
//package day3;
//
//public class Hukusyuu {
//
//    public static void main(String[] args) {
//
//    	int num = 1;
//    	
//    	case 1:
//    		System.out.println("one");
//    		break;
//    	case 2:
//    		System.out.println("two");
//    		break;
//    	case 3:
//    		System.out.println("three");
//    		break;
//		default:
//    		System.out.println("x");
//    	}
//    }
//}






