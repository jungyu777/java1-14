package test.main;

import test.mypac.AndroidPhone;

public class MainClass05 {
	public static void main(String[] args) {
		
		//AndroidPhone 객체를 생성해서 참조값을 AndroidPhone type p1 이라는 지역변수에 담기
		AndroidPhone p1 = new AndroidPhone();
		//메소드 호출해보기		  하나의 heap 영역에 담겨있다 사물함키(참조값27)
		//객체는1개지만 그 안에 들어있는 것은 3개의객체 phone handphone AndroidPhone
		//객체안에서 자기 자신의 참조값을 가르키는게 this.
		//한 사물함 안에서 자식객체에서 부모객체를 가르키는 super 
		p1.call();			//phone 메소드
		p1.mobileCall();	//HandPhone 메소드 
		p1.takePicture();	//HandPhone 메소드
		p1.doInternet();	//AndroidPhone 메소드
		p1.showPlatform();	//AndroidPhone 메소드
		
		//부모의메소드지만 자식클래스에서 수정할수있다  메소드오버라이딩
		//부모클래스 수정하지않고 수정할수있다
	}
}
