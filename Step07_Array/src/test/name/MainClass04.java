package test.name;

import test.mypac.Bike;

public class MainClass04 {

	public static void main(String[] args) {
		/*
		 * 1.Bike 객체를 담을수 있는 방 3개짜리 배열객체를 생성해서 참조값을
		 * bikes 라는 지역 변수에 담아보세요.
		 * 2.배열의 각각의 방(0,1,2번) 에 bike 객체를 생성해서 담아보세요.
		 * 3.반복문 for 를 이용해서 순서대로 배열의 각각의 방에 있는 bike 객체의 ride()메소드를 호출해보세요
		 * 메소드 호출 .. ..........잊지마셈......................
		 */
		Bike[] bikes = new Bike[3];
		bikes[0]=new Bike();
		bikes[1]=new Bike();
		bikes[2]=new Bike();
		for(int i=0;i<bikes.length;i++) {
			//1번쨰 방에 있는Bike 객체의 참조값을 얻어와서 임시변수 tmp에 담기
			Bike tmp=bikes[i]; //Bike 배열이기 때문에
			//객체의 참조값이 들어있는 tmp 에 .  찍어서 메소드 호출
			tmp.ride();
			bikes[i].ride();
			
		}
		System.out.println("--------확장 for 문을 사용--------");
		for(Bike tmp:bikes) {//탑입 ???:
			tmp.ride();
		}
		for(Bike www:bikes) {//탑입 ???:
			www.ride();
		}
	}
}
