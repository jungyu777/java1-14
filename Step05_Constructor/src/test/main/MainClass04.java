package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 
		 * java.util 페키지에 있는 random 클래스 사용해보기
		 */
		Random ran = new Random();
		//0-9사이의 랜덤한 정수를 얻어내서 ranNum이라는 지역변수에 담아보세요
		
		 int ranNum = ran.nextInt(10);
		//ranNum 지역 변수에 담기 내용을 콘솔창에 풀력해보세요.
		 System.out.println(ranNum);
		
	}
	
	
}
