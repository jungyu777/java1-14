package test.Main;

import test.Mypac.Car;

public class MainClass {

	public static void main(String[] args) {
		//참조값은 나왔지만
		//Car 객체를 생성해서 사용하지 않고 버림
		new Car();
		
		//Car 객체를 생성해서 1번하고 버림)객체를 1횡ㅇ으로 사용)
		new Car().drive();
		System.out.println(new Car().name);
		
		//Car 객체를 생성해서 나온 참조값을 c1이라는 Car type 지역변수에 담아놓고
		Car c1= new Car(); //객체(물건은 new할떄 만들어진다)
		//필요할떄 마다 c1 에. 찍ㅇ서 여러번 사용할수있다.
		c1.drive();
		c1.drive();
		System.out.println(c1.name);
		
		
		
	}

}
