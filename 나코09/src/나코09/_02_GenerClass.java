package 나코09;

import User.User;
import User.VipUser;
import coffee.Coffee;
import coffee.CoffeeByName;
import coffee.CoffeeByNickName;
import coffee.CoffeeByNumber;
import coffee.CoffeeByUser;

public class _02_GenerClass {

	public static void main(String[] args) {
		//제레닉 클래스
		CoffeeByNumber c1 = new CoffeeByNumber(33);
		c1.ready();
		
		CoffeeByNickName c2 = new CoffeeByNickName("유재석");
		c2.ready();
		System.out.println("-------------------------------------------------------------");
		CoffeeByName c3 = new CoffeeByName(34);
		c3.ready();
		
		CoffeeByName c4 = new CoffeeByName("박명수");
		c4.ready();
		System.out.println("-------------------------------------------------------------");
		int c3Name = (int) c3.name;
		System.out.println("주문고객 번호 : 형변환 옵젝에서 int " + c3Name);
		
		String c4Name = (String)c4.name;
		System.out.println("주문 고객 이름 : 형변환 Str" + c4Name);
		
		System.out.println("-------------------------------------------------------------");
		//제네릭스 클래스 Coffee를 사용하면 개발상의 실수를 없애고 딱 정해진 타입의 데이터만 사용할수있다
		Coffee<Integer> c5 = new Coffee<>(35);
		c5.ready();
		int c5Name = c5.name;
		System.out.println("주문 고객 번호 : " + c5Name);
		
		
		Coffee<String> c6= new Coffee<>("조세호");
		c6.ready();
		String c6Name = c6.name;
		System.out.println("주문고객번호 : " + c6Name);
		
		System.out.println("-------------------------------------------------------------");
		//어떤 정해진 형태의 클래스 객체만 받겠다 public class CoffeeByUser <T extends User>
		//어떤 형태의 타입을 쓰건 상관없는데 반드시 User라는 클래스를 상속하는 타입을써야한다
		CoffeeByUser<User> c7 =new CoffeeByUser<>(new User("강호동"));
		c7.ready();
		
		
		System.out.println("-------------------------------------------------------------");
		CoffeeByUser<User> c8 = new CoffeeByUser<User>(new VipUser("서장훈"));
		c8.ready();
		
		System.out.println("-------------------------------------------------------------");
		orderCoffee("김영철");
		orderCoffee(36);
		
		orderCoffee("김희철","아메리카노");
		orderCoffee(37,"라떼");
		
		
		
		
		
		
		
		
	}
	
	
	
	public static <T> void orderCoffee(T name) {
		System.out.println("커피 준비완료 :::::"  + name);
	}
	public static <T , V> void orderCoffee(T name , V coffee) {
		System.out.println(coffee+  " 준비완료 :::::"  + name);
	}

}
