package review.test;

import java.util.Random;

public class main00 {
	public static void main(String[] args) {
	
	
		/*
		 * 1. run 했을떄
		 * cherry,apple,banana,melon,7
		 * 5개의 문자열 중에서 1개가 랜덤하게 출력되게 해보세요
		 */
		String[] result= {"cherry","apple","banana","melon","7"};
		Random ran = new Random();
		int[] result2 = new int[3];
		for(int i=0; i < 3; i++) {
			int ranNum = ran.nextInt(5);
			result2[i] =ranNum;
			System.out.print(result[ranNum]);
			if(i<2) {
				System.out.print("|");
		}
		}
		if(result2[0]==result2[1] && result2[1]==result2[2]) {
			System.out.println("당청");
		}else {
			System.out.println("꽝");
		}
		
	}
}
