//Seiseki.javaを作成
//・name
//・point( 点数）
//・subject（項目）
//・rank（順位)
//
//コンストラクタなし
//
//・３人の成績情報を入力する
//※全ての入力はScannerのみ使用
//
//例）
//何人の成績情報を入力しますか？
//１番目の生徒の名前を入力してください
//１番目の生徒の点数を入力してください
//
//・
//・
//・
//・
//n番目の生徒の順位を入力してください
//
//入力後に入力された成績情報を自由に出力する。



package day8;

import java.util.Scanner;

public class Seiseki {
    String name;
    int point;
    String subject;
    int rank;

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = n
        // 3人の成績情報を保存する配列です
        Seiseki[] students = new Seiseki[3];

        // 3人の成績情報を入力してもらいます
        for (int i = 0; i < 3; i++) {
            
            students[i] = new Seiseki();

            //学生の情報入力
            System.out.println((i + 1) + "番目の生徒の名前を入力してください:");
            students[i].name = scanner.nextLine();

            System.out.println((i + 1) + "番目の生徒の点数を入力してください:");
            students[i].point = scanner.nextInt();
            scanner.nextLine();


            System.out.println((i + 1) + "番目の生徒の項目を入力してください:");
            students[i].subject = scanner.nextLine();

            System.out.println((i + 1) + "番目の生徒の順位を入力してください:");
            students[i].rank = scanner.nextInt();
            scanner.nextLine();
        }

        // 入力された成績情報を出力します
        System.out.println("\n入力された成績情報:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "番目の生徒の成績情報:");
            System.out.println("名前: " + students[i].name);
            System.out.println("点数: " + students[i].point);
            System.out.println("項目: " + students[i].subject);
            System.out.println("順位: " + students[i].rank);
        }

        //Scanner資源解除
        scanner.close();
    }
}