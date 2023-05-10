package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass02 {

	public static void main(String[] args) {
		/*
		 * 지역변수나 필드앞에 선언하는 data type 은 (참조 데이터 type)
		 * 그안에 들어있는 참조값의 사용설명서 라고 생각하면되다
		 * 그렇기 때문에 그 지역변수나 필드에 .  을 찍으면 사용 설명서에 명시된 기능만 사용할수있다
		 * java의 모든 객체는 다형성을 가질수있다
		 * 다형성은 type 이 여러개라는 의미이다
		 */
		//HandPhone 객체를 생성해서 나온 참조값을 HandPhone type 지역변수 p1에 담기
		HandPhone p1 = new HandPhone();
		System.out.println("----------");
		
		//HandPhone 객체를 생성해서 나온 참조값을 Phone type 지역변수 p2 에담기
		Phone p2 = new HandPhone();
		p2.call();//Phone type 으로 객체를 만들면 HandPhone에있는 메소드를 콜할수없다 생성자는 어떻게 만들든 호출된다
		System.out.println("----------");
		//다형성 type 이 여러가지가 된다 
		//어떤 객체를 부모타입으로 받으면 프로그래밍이 유연해진다 ex)Phone p2 = new HandPhone();
		
		//HandPhone 객체를 생성해서 나온 참조값을 object type 지역변수 p3에 담기
		Object p3 = new HandPhone();
		//p3.                 object 메 명시된 메소드만 사용가능
		
		

	}

}
