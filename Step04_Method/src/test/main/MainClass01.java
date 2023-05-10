package test.main;

import java.io.File;
import java.util.Scanner;

import test.mypac.Airplane;
import test.mypac.Test;

public class MainClass01 {

	public static void main(String[] args) {
		Test t = new Test();
		//리턴값을 설정해준 메소드는 호출하고 나서 다시 그값이 되돌아온다 부메랑같다 
				
		//void 메소드의 특징은 호출하고 끝!!!!!!!!!!!!
		t.walk(); //void 리턴타입이없다 메소드를 호출하고 나면 값을 가져오지 않는 예약어
		
		//리턴값10이있는 t.getNumber(); 를 호출하고나면 10으로 바껴있다
		//리턴타입이있는 메소드를 호출하고나면 그 리턴값으로 바껴있다.
		//t.getNumber();이 형태로 냅두면 리텁값을 버리는거다
		//리턴되는 값을 담고싶으면 int a = t.getNumber();
		//return type 이 int 인 메소드 호출하고 리턴되는 값을 a 라는 int type 지역변수에담기
		int a = t.getNumber();
		
		//리턴해주는 값과 담는것은 타입이 돌일해야된다
		//return type 이 String 인 메소드 호출하고 리턴되는 값을 b 라는 String type 지역변수에 담기
		String b = t.getGreeting();
		System.out.println("main 메소드가 종료 됩니다.");
		System.out.println();
		
		
		 //return type 이 Airplane 인 메소드 호출하고 리턴되는 값을 c라는 Airplanetype 지역변수에담기
		 Airplane c = t.getPlane();
		 c.fly();
		 
		 //위에서 생성한 객체의 setNum() 메소드를 호출해보세요.
		 t.setNum(10,2); 
		 //위에서 생성한 객체의 srtName() 메소드를 호출해보세요.
		 t.setName("이거구나");
		 //위에서 생성한 객체의 srtPlane() 메소드를 호출해보세요.
		 t.setPlane( new Airplane());
		 
		 t.doSomething(2, "wwww", new Airplane());
		
		 System.out.println("main 메소드가 종료됩니다");
		 //Airplane에 들어있는 fly 메소드를 plane메소드에 리턴값으로 담아서 c.fly();를 총해서호출한다
		 
		 //---------------------------
		 
		 
		 t.send();
		 t.send(2);
		 t.send("하요");
		 t.send(new Airplane());
		 
		 
//			public void send(String name,int age,Airplane plane) {
//				System.out.println("이름은: " + name);
//				System.out.println("나이는: " + age);
//				System.out.println("특징은:"  +  2222);
//			}
	//   test 클래스에 파라미터(타입값을 저장해두고 메인메소드에서 그값을 대입해서 출력한다)
//		 t.send(new Airplane()); 새로운 객체를 만들어서 Airplane클래스랑은 상관이없다 어떤값이든 적기만하면 바로출력된다
		 t.send("철수", 111, new Airplane());
		 //new Airplane() 새로운객체
		 
		 //마음가짐의 중요성 할수있다 생각하면 할수있다
		 
		 
		 
	}

}
