package day3;

public class Homework_2 {
    public static void main(String[] args) {
        int number = 1;

        while (number <= 100) {
            String numStr = Integer.toString(number);
            int clapCount = 0; // "짝" 출력 횟수를 카운트합니다.

            for (int i = 0; i < numStr.length(); i++) { // 문자열의 각 문자를 검사합니다.
                char ch = numStr.charAt(i); // 문자열의 i번째 문자를 가져옵니다.
                if (ch == '3' || ch == '6' || ch == '9') {
                    System.out.print("CLAP");
                    clapCount++; // "짝" 출력 횟수를 증가시킵니다.
                }
            }

            if (clapCount == 0) { // "짝"을 한 번도 출력하지 않은 경우
                System.out.print(number); // 숫자를 출력합니다.
            }

            System.out.println(); // 다음 줄로 이동
            number++;
        }
    }
}
