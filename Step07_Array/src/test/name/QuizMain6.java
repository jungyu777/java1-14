package test.name;

import java.util.Random;

public class QuizMain6 {

	public static void main(String[] args) {
		/*
		 * 2.run했을떄
		 * 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해보세요.
		 * 예( cherry | apple| charry
		 * 7|apple|melon
		 * 7|7|7
		 */
		/*
		 * 3.우연히 3개가 모두 같게 나왔을떄는 "당첨뙸습니다!" 를 출력하고
		 *   하나라도 다르면 "꽝" 을 출력하도록 프로그래밍해보세요.
		 */
		int[] nums = new int[3];
		String[] items= {"cherry","apple","melon","7","banana"};
		Random ran = new Random();
		for(int i=0;i<3;i++) {
			
			int ranNum = ran.nextInt(5);
			nums[i]=ranNum;
			System.out.print(items[ranNum]);
			if(i<2) {
				System.out.print("|");
			}
		};
		System.out.println();
		if(nums[0]==nums[1]&&nums[1]==nums[2]) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}

	}

}
