package test.main;

import test.mupac.MyRemocon;
import test.mupac.Remocon;
import test.mupac.TVRemocon;


public class MainClass02 {
	public static void main(String[] args) {
		//다형성 확인
		MyRemocon r1 = new MyRemocon();
		Remocon r2= r1;
		Object r3=r1;
		
		//직접 클래스를 test.mypac 패키지에 파일로 만들어서 useRemocon() 메소드를 여기서 호출해보세요
		TVRemocon r4 = new TVRemocon();
		useRemocon(r4);
		
		//나만의 기능도 호출해보기
		r4.reserve();
	};
	
	//담겨있는 사용설명서가 Remocon 이여서 reserve 는TVRemocon의 메소드 이기떄문에 아래에서는 호출하기 번거로움
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		//만일  여기서 reserve() 메소드를 활용하고 싶으면  케스팅하면된다 but 확신이있어야한다
		TVRemocon r2 =(TVRemocon)r;
		r2.reserve();
		
		
		
	}
	
	

	
	
	
	
}

