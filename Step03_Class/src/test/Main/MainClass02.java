package test.Main;

import test.Mypac.Car;

public class MainClass02 {

	public static void main(String[] args) {
		//car 객체를 생성해서 참조값을 Car type 지역변수 car1에담기
		Car car1 = new Car();
		//car1 에 담긴 참조값을 Car type 지역변수 car2에 복사해주기
		Car car2 = car1; 
		//Car type 의 참조값을 담을수 있는 지역변수 car3 만들기
		Car car3 = null;
		
		
		car1.name="아반뗴";
		String a=car1.name;
		String b=car2.name;
		
		car1.drive();
		car2.drive();
		//NullpointerException 발생 car3변수안에는 참조값이 없다.
		//car3.drive();
		//druve() 메소드는 리턴 type  이 void 이기 떄문에 아래의 코드는 성립하지 않는다
		//Car c2 = new Car().drive();
		

	}

}
