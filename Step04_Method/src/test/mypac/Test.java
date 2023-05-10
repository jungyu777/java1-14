package test.mypac;
/*
 * [메소드를 만들떄 고려해야하는것]
 * 
 * 1.접근지정자 (모르면 public)
 * 2.static or non static (모르면 non static)
 * 3.리턴 type  (모르면 void)
 * 4.메소드명
 * 메소드에 전달하는 인자의 갯수와 데이터 type 
 */
public class Test {
	public void walk() {
		System.out.println("걸어요!");
	}
	public int getNumber() {//int 타입을 리턴하기로했으면 리턴해줘야 문법적오류가없다
		return 10;
	}
	public String getGreeting() {
		return "안녕하세요";
	}
	
	
	public Airplane getPlane() {
		Airplane plane = new Airplane();
		return plane;
	}
	
	
	//int type 을 메소드의 인자로 전달받는 메소드
	public void setNum(int num,int ss) //여기 안에 받을 값의타입
	{
		
	}
	//String type 을 메소드의 인자로 전달받는 메소드
	public void setName(String name) {
		
	}
	//Airplane type 을 메소드의 인자로 전달받은 메소드
	public void setPlane(Airplane plane) {
	//파라미터 : 메소드에 전달해야될 인자1개 Airplane타입
	}
	//int,String , Airplane 타입 세개를 전달받는 메소드
	public void doSomething(int num,String name, Airplane plane) {
		
	}
	
	public void send() {
		System.out.println("무언가를 전송해요");	
	}
	public void send(int num) {
		System.out.println(num + "을 전송해요");
	}
	public void send(String name) {
		System.out.println(name + "을 전송해요");
	}
	public void send(Airplane plane) {
		System.out.println("비행기를 전송해요");
	}
	
	public void send(String name,int age,Airplane plane) {
		System.out.println("이름은: " + name);
		System.out.println("나이는: " + age);
		System.out.println("특징은:"  +  999999999);
	}
	
	
}
