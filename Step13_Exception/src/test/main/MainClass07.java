package test.main;

import test.mypac.MyUtil;

public class MainClass07 {

	public static void main(String[] args)   {
		
		//메소드 안에서 발생하는 예외를 직접 처리한 draw() 메소드 호출
		MyUtil.draw();
		

		//메소드 안에서 발생ㅇ하는 예외를 throws 한 drow() 메소드 호출
		//메인 메소드 와서 try catch해야함...
		try {
			MyUtil.send();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료됩니다.");
	}
//	package test.mypac;
//
//	public class MyUtil {
//		//5초가 걸리는 가상의 그림을 그리는 메소드
//		public static void draw() {
//			System.out.println("5 초 동안 그림을 그려요... ");
//			
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
//			
//			System.out.println("그림 완성!");
//		}
//		//5초가 걸리는 가상의 전송을 하는 메소드
//		
//		public static void send() throws InterruptedException {
//			System.out.println("5초 동안 전송을 해요 ...");
//			Thread.sleep(5000);
//			System.out.println("전송완료!!");
//		}
//		
//	}
	
	
	
	
	
	

}
