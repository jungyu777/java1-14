package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass01 {
 
	public static void main(String[] args) {
		/*
		 * phone 클래스를 상속받은 handphone 클래스로 객체를 생성해서 
		 * 그 참조값을 p1 이라는 이름의 지역변수에 담기
		 * 부모클래스에 정의된 메소드도 사용가능하다
		 */
		HandPhone p1 = new HandPhone(); //생성자 호출시점  Phone 생성자 동시호출 HandPhone 생성자
		//부모객체가 먼져 만들어지고 자식객체가 만들어진다
		//상속 받은 클래스를 객체로 만들어야  IMPORT 했을떄 둘다 사용가능
		/*
		 * HandPhone 클래스의 생성자를 호출해서 객체를 생성했더니
		 * phone 클래스의 생성자도 호출되는걸 할수가 있다.
		 * 
		 * 따라서 HandPhone 객체도 생성되고 Phone 객체도 같이 생성 되었다는걸 유추할수있다.
		 * 
		 * Phone 객체와 HandPhone 객체가 생성되어서 같은 사물함에 들어간다
		 * 
		 * 즉, 하나의 참조값으로 Phone 의 기능, HandPhone의 기능을 모두 사용할수있다.
		 * 
		 * 
		 */
		p1.call(); //phone 메소드
		p1.mobileCall(); // HandPhone 메소드
		p1.takePicture();//HandPhone 메소드

	}

}
