package day3;

public class Kadai {

	public static void main(String[] args) {
		//ifとelse ifに入れる正しい条件を与えてください。

				int age = 99;/*数字記入*/;
				if(age >=20 && age <= 29){

					System.out.println("20代です｡");
					//両方の条件が正しいければ実行
					}else if(age <=20){

						System.out.println("未成年者です。");
						//ifの条件がfalseでelse ifの条件がtrueなら実行
					}else {
						System.out.println("未成年者でも20代でもありません。");
						//ifとelse ifの条件がfalseなら実行
					}
			}
	}
