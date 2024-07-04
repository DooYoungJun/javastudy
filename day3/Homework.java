package day3;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	        
	        // 문자를 받습니다. 
	        System.out.println("인사말을 입력하세요 (Japanese, Korean, English): ");
	        // toLowerCase는 소문자로 바꿔주는 매서드입니다. 어떤 형식으로 받아도 오류가 안나게 해줌
	        String language = scanner.nextLine().toLowerCase();

	        switch (language) {
	            case "japanese":
	                System.out.println("こんにちは");
	                break;
	            case "korean":
	                System.out.println("안녕하세요");
	                break;
	            case "english":
	                System.out.println("Hello");
	                break;
	            default:
	                System.out.println("한영일만 입력가능합니다.");
	                break;
	        }
	        
	        scanner.close();
	}
}
