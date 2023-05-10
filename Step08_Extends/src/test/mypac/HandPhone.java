package test.mypac;

/*
 * 이미 존재하는 
 */
public class HandPhone extends Phone{//extends 상속할클래스명
		//Phone 상속 받아서 사용하겠다 클래스들끼리는 상속관계가 가능 
		//상속은 1개씩만 가능하다
	public HandPhone() {
		System.out.println("HandPhone 생성자 호출됨");
	}
	
	public void mobileCall() {
		System.out.println("이동중에 전화를 걸어요");
	}
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍어요");
	}

}
