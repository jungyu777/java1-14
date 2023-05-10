package test.name;

import java.util.Random;

public class MainClass07 {

	public static void main(String[] args) {
		Random ran=new Random();
		//0=9사이의 랜덤한 정수
		int ranNum = ran.nextInt(10);
		//0-10 사이의 랜덤한정수
		int ranNum2 = ran.nextInt(11);
		//0-19 사이의 랜덤한정수
		int ranNum3 = ran.nextInt(20);
		//만일 0-4 사이의 랜덤한 정수
		int ranNum4 = ran.nextInt(5);
		//-25 = 25 사이의 랜덤한정수
		int ranNum5 = ran.nextInt(-25,26); 
		System.out.println(ranNum5);
		int ranNum6 = ran.nextInt(50)-25;
	}

}
