package day10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInfoSaver {

    // 아이디와 비밀번호를 입력받아 CSV 파일에 저장하는 메소드
    // IDとパスワードを入力してCSVファイルに保存するメソッド
    public static void saveUserInfoToCSV() {
        Scanner scanner = new Scanner(System.in);

        // 아이디 입력 요청 / IDの入力を求める
        System.out.println("아이디를 입력해주세요:");
        System.out.println("IDを入力してください:");
        String id = scanner.nextLine();

        // 비밀번호 입력 요청 / パスワードの入力を求める
        System.out.println("비밀번호를 입력해주세요:");
        System.out.println("パスワードを入力してください:");
        String password = scanner.nextLine();

        // 입력받은 아이디와 비밀번호를 CSV 파일에 저장 / 入力されたIDとパスワードをCSVファイルに保存
        try {
            String filename = "/Private Coding/Java/javastudy/src/Login.csv";

            // 디렉토리가 존재하지 않으면 생성 / ディレクトリが存在しない場合は作成
            File file = new File(filename);
            file.getParentFile().mkdirs();

            try (FileWriter writer = new FileWriter(filename, true)) {
                writer.append(id)
                      .append(",")
                      .append(password)
                      .append("\n");
                System.out.println("회원정보가 저장되었습니다.");
                System.out.println("会員情報が保存されました。");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 아이디와 비밀번호를 입력받아 CSV 파일에 저장하는 메소드 호출 / IDとパスワードを入力してCSVファイルに保存するメソッドを呼び出す
        saveUserInfoToCSV();
    }
}
