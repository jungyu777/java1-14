package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {

	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 나온 참조값을 object type p3 라는 지역변수에 담아보세요
		Object p3 = new HandPhone();
		//Object type  p3 변수에 담긴 값을 Phone type p2 라는 변수에담기
		Phone p2 = (Phone)p3;//Object type 이 그냥 담기지는않고 케스팅해야된다 왜냐하면 Object type
		//케스팅하면 타입을(사용설명서)를 바꿀수있다
		
		//Object type  p3 변수에 담긴 값을 HandPhone p1 라는 변수에담기
		HandPhone p1= (HandPhone)p3;
		
		p1.takePicture();
		HandPhone p6 = new AndroidPhone();
		p6.takePicture();
		
		
		AndroidPhone p5 =new AndroidPhone();
		p5.takePicture();
	}

}
