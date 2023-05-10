package test.name;

import java.util.Random;

public class QuizMain {

	public static void main(String[] args) {
		/*
		 * 1. run 했을떄
		 * cherry,apple,banana,melon,7
		 * 5개의 문자열 중에서 1개가 랜덤하게 출력되게 해보세요
		 */
//		String[] run = new String[5];
//		run[0]="cherry";
//		run[1]="apple";
//		run[2]="banana";
//		run[3]="melon";
//		run[4]="7";
		String[] run={"cherry","apple","banana","melon","7"};
		Random ran = new Random();
		int ranNum= ran.nextInt(5);
		System.out.println(run[ranNum]);
		
	}

}
