package test.mypac;

public class Zoo {
	//생성자 메소드 필드 클래스를 정의 할수있다
	//클래스안에 클래스를 정의 할수있는데 내부 클래스(inner class)
	public class Monkey{
		public void say() {
			System.out.println("안녕! 나는 원숭이야");
		}
	}
	
	//내부클래스
	public class Tiger{
		public void say(){
			System.out.println("안녕 나는 호랑이야");
		}
	}
	
	//메소드 추가
	public  Monkey getMonkey() {
		//내부클래스로 객체를 생성해서 리턴해주기
		return new Monkey();
	}
	public Tiger getTiger() {
		return new Tiger();
	}
}
