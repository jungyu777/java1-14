package test.auto;

public class Bus extends Car{
	//부모 생성자에서 필요한 값을 자식생성자에서 받아서 전달해 주는 코드가 있어야 문법이 성립된다.
	public Bus(Engine engine) {
		//super()호출 이전에 다른 코드를 한줄이라도 실행하면안된다
		//int num=10; < 슈퍼를 안하고하면 에러가난다
		//super() 는 무모 생성자를 가리키는 표현식이다.
		
		
		super(engine);//super(engine) 부모한테 필요한 값을 자식 생성자 에서 받아서 전달해준다
	}
	public void powerDrive() {
		if(this.engine==null) {
			System.out.println("Engine 객체가 없어서 달릴수가 없어요");
			return;
		}
		System.out.println("승객을 태우고 힘차게 달려요");
	}
	

}
