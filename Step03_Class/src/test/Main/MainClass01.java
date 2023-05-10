package test.Main;

import test.Mypac.Car;

public class MainClass01 {
	//run 했을떄 실행의 흐름이 시작되는 특별한 main 메소드
	public static void main(String[] args) {
		
		/*
		 * 만일 달리고 싶다 어떻게 해야될까?
		 */
		//객체를 생성하고 참조한 car1에 .을 찍으면 사용가능한 필드와 메소드 목록이나옴
		//car 클래슬 객체를 생성하고 생성된 객체의 참조값을 car1이라는 지역변수에 담기
		Car car1 = new Car();
		//클래스 아름 / 새로운객체이름 /new 클래스명();
		//Car 객체의 팜조값에 . 을 찍어서 메소드 호출하기
		//참조값에다 . 을찍으면 필드를 참조하거나 메소드를 콜할수있다
		car1.drive(); //값이없을떄
		//car 객체의 참조값에 . 찍어서 필드 참조하기 (참조해서 값 대입하기)
		car1.name="소나타";
		car1.price=1000;
		car1.drive(); //소나타 추가했을떄
		//car 클래스로 객체를 생성하고 생성된 객체의 참조값을 car2 라는 지역변수에담기
		Car car2= new Car();
		car2.drive();
		car2.name="그렌져";
		car2.drive();
		car2.price=2000;
		
		System.out.println(car2.name);
		
		Car car3 = new Car();
		System.out.println(car3.name);
		boolean result = car1 == car2; //false
		boolean result2 = car1.name==car2.name; //false
		System.out.println(result);
		
	}

}
