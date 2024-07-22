package day1;

public class Task {
	public static void main(String[] args) {
		
		//계단이 순방향으로 나오게함
        
         int height = 5;
         // 행수 제어를 하기 위해 만들었습니다.
        for (int i = 1; i <= height; i++) {
        	// 네모 출력을 하기 위해 만들었습니다.
            for (int j = 1; j <= i; j++) {
                System.out.print("■ ");
            }
            System.out.println();
        }
        
		
		
		//계단이 역방향으로 나오게함
        
		//int height = 5;

        // 역방향 계단을 출력합니다.
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("■ ");
            }
            System.out.println();
        }
        
		
		//구구단 만들기
        // 2단부터 9단까지 반복합니다.
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단:");
            
            // 각 단에 대해 1부터 9까지 곱합니다.
            // 안 쪽의 루프가 끝나기 전까지 안에서만 반복합니다.
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            
            // 각 단이 끝난 후 줄바꿈을 추가합니다.
            System.out.println();
        }
	}
	
}

