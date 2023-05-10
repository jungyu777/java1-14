package test.name;

import java.util.Random;

public class QuizMain3 {
	public static void main(String[] args) {
		/*
		 * 3.우연히 3개가 모두 같게 나왔을떄는 "당첨뙸습니다!" 를 출력하고
		 *   하나라도 다르면 "꽝" 을 출력하도록 프로그래밍해보세요.
		 */
		
		String[] items ={"cherry","apple","banana","melon","7"};
		Random ran = new Random();
		//배열 새로 미리 만들고
		int[] nums=new int[3]; 
		//반복문3번돌리기
		for(int i=0; i<3;i++) {
			int ranNum=ran.nextInt(5);
			//얻어낸 숫자를 배열의 i번쨰 방에 저장하기
			nums[i]=ranNum;
			System.out.print(items[ranNum]);
			if(i<2) {//|2번 출력하고 싶은조건
				System.out.print("|");
			}//나왔던 숫자 3개를 어딘가 저장했다가 숫자3개가 모두 같은지 비교를 해야한다
		};
		
		System.out.println(); //개행기호만출력
		//만일  랜덤한 숫자가 모두 같으면
		if(nums[0] == nums[1] && nums[1]==nums[2]) {
			System.out.println("당첨됬습니다");
		}else {
			System.out.println("꽝");
		}
		
	}

}
