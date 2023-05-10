package test.mypac;

public class MyWeapon extends Weapon{
	//부모클래스의 메소드를 완성시키기 위한 매개체에 불과하다 
	//부모글래스의 추상메소드를 반드시(강제로) 오버라이드 해야한다.
	@Override
	public void attack() {
		//어디를 공격할지는 프로젝트 상황에 맞게 마음대로 공격하면 된다.
		System.out.println("지상 공격을 해요!");
	}
	//오브젝트를 상속받아서 웨폰 웨폰을 상속받아서 마이웨폰 다형성 다양한 하나의 객체는 다양한 타입이될수있다
	
	

}
