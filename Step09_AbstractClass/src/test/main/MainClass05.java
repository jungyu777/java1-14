package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	//내부클래스에 한해서 static을 붙일수있다
	//클래스 파일을 따로 만들지 않고 클래스를 정의 할수 있다 다만 static 을 붙여주어야한다
	static class SeaWeapon extends Weapon{

		@Override
		public void attack() {
			System.out.println("바다에 있는 적들을 공격해요!");
		}
		
	}
	
	public static void main(String[] args) {
		
		//바다를 공격하는 무기를 만들어서 사용하고 싶다
		Weapon w1= new SeaWeapon();
		w1.prepare();
		w1.attack();
		
		
		//우주를 공격하는 무기를 만들어서 사용하고싶다.
		class SpaceWeapon extends Weapon{

			@Override
			public void attack() {
				System.out.println("우주에 있는 적들을 공격해요!");
			}		
		}
		Weapon w2=new SeaWeapon();
		w2.prepare();
		w2.attack();
		
	}

}
