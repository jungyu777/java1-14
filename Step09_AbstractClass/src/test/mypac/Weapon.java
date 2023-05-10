package test.mypac;
//미완성된 추상메소드를 맴버로 가지고 있는 클래스는 abstract 예약어를 붙여서 정의 해야한다.
public abstract class Weapon {
	//무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기작동을 준비합니다");
	}
	
	
	//공격을 하는 메소드의 모양만 정의하고 실제 구현은 하지않기
	//미완성된 추상메소드를 만들떄는 abstract 예약어가 필요하다
	public abstract void attack(); //미완성으로 남겨두겠다 반드시 클래스에도 abstract 을 남겨두어야 에러가 안난다
	
	//추상클래스는 단독으로 new 할수가없다
	//상속을 받아서 자시클래스에서 오버라이딩 해서 부모클래스를 완성해줘야한다 
	
}
