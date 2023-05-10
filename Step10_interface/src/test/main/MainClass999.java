package test.main;

import test.mupac.HandPhone;

public class MainClass999 {

	public static void main(String[] args) {
//		HandPhone h1 = new HandPhone() { //이것은 객체를 만들어서 h1 에 담은거고 그 담은걸 메인메소드 밖에서 전달해준다
//
//			@Override
//			public void smart() {
//				System.out.println("추상");
//				
//			}
//
//			@Override
//			public void call() {
//				System.out.println("클래스");
//				
//			}
//
//			@Override
//			public void messenger() {
//				System.out.println("화이팅");
//				
//			}
//		};
//		AndPhone(h1);
		
		
		AndPhone(new HandPhone() {//이거는 익명 클래스로 만들어서 객체롤 바로만든다
			//그리고 밑에 메소드가 호출될떄 콜된다

			@Override
			public void smart() {
				System.out.println("추상");
				
			}

			@Override
			public void call() {
				System.out.println("클래스");
				
			}

			@Override
			public void messenger() {
				System.out.println("화이팅");
				
			}
			
		});
		
		
		
		
		
		
		
	}
	public static void AndPhone(HandPhone h){
		h.smart();
		h.call();
		h.messenger();
	}

}
