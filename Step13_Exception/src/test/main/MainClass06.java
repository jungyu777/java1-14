package test.main;

import java.util.Random;

import test.mypac.WowException;

public class MainClass06 {

	public static void main(String[] args) {
		Random ran =new Random();
		//0~4 사이의 랜덤한 정수 얻어내기
		int ranNum = ran.nextInt(5);
		//우연히 가장 큰수가 나오면 WowException 을 발생시키기
		if(ranNum==4) {
			//throw 예약어와 함꼐 예외 객체를 생성하면 예외가 발생한다.
			throw  new WowException("놀랍네 이거 ㄷㄷ");
		}
		System.out.println("main 메소드가 종료됩니다");

	}

	
//	package test.mypac;
//
//	public class WowException extends RuntimeException{
//		/*
//		 * 떄로는 우리가 직접 예외 글래스를 정의하고
//		 * 
//		 * 필요한 시점 혹은 특정 이벤트가 발생했을떄 예외를 throw 해야 할떄가 있다.(예외를 발생 시킬수있어야한다)
//		 * 
//		 * 예외 클래스는 RuntimeException 을 상속 받아서 만들면 된다.
//		 * 
//		 */
//		//예외 메세지를 생성자의 인자로 전달 받아서 부모 생성자에 전달하는 생성자를 만들면 편리하다
//		public WowException(String msg) {
//			super(msg);
//		}
//	}

	
	
}
