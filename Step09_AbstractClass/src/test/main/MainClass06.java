package test.main;


import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		
		//아래 있는 useWeapon()메소드를 호출하려면 Weapon type의 참조값이 필요하다.
	      //Weapon w1 = new MyWeapon();   
	      //useWeapon(w1);
	      //이름이 있는 클래스를 따로 만들지 않고 추상클래스 Weapon type의 참조값을 얻어낼수 있을까 ?
	
		Weapon w1 = new Weapon() {//<- {} class  클래스인데 이름이없고 
			//이름이 없는 익명의 클래스이다 
			//extends Weapon 한 클래스이다...
			//메소드 안에 정의된 클래스
			@Override
			public void attack() {
				System.out.println("아무나 공격하자!");
				
			}
		};
		
		useWeapon(w1);
		
		//메소드를 호출할떄 바로 익명클래스를 이용해서 웨폰 타입의 참조값을 얻어내서 사용하기
		//유즈 웨폰을 호출하면서 객체를 즉석에서 생성해서 전달하기
		useWeapon(new Weapon(){
			@Override
			public void attack() {
				System.out.println("즉석공격");
				
			}
			
		});
	}
	
	//Weapon type 의 참조값을 전달 받아서 사용하는 static 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		            
		w.attack();
	}
}
//메인스테틱메소드 안에 오버라딩2개가 있어서  유스웨폰 메소드를 호출하면 2개가나온다