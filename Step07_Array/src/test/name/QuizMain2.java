package test.name;

import java.util.Random;

public class QuizMain2 {
	public static void main(String[] args) {
		/*
		 * 2.run했을떄
		 * 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해보세요.
		 * 예( cherry | apple| charry
		 * 7|apple|melon
		 * 7|7|7
		 */
		
		String[] items ={"cherry","apple","banana","melon","7"};
		Random ran = new Random();
		
		//반복문3번돌리기
		for(int i=0; i<3;i++) {
			int ranNum=ran.nextInt(5);
			//배열의 인덱스로 활용해서 문자열 출력하기
			System.out.print(items[ranNum]);
			if(i<2) {//|2번 출력하고 싶은조건
				System.out.print("|");
			}
		
		};
		
	}

}
