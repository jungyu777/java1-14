package test.Main;

import test.Mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		Car car1 = new Car(); //값이 없는상태로 새로운 객체생성
		Car car2 = new Car();
		
		car1.name="소나타";  //name에 값을 설정
		car2.name="제네시스";
		
		car1.drive();  //this.name 을통해서 car1.drive()호출할떄 위에 참조값을 같이호출함
		car2.drive();
		car1.drive();
		//어떤 객체의안에서 필드의 내용을 참조하는법
		//동일한 객체의 안에서 필드의 값을 참조하는법
		//this
		//public void drive() {
			//System.out.println(this.name + "달려요");
		//}	
		
	}
}
