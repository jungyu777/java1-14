package test.main;

import test.mupac.Drill;

public class MainClass04 {

	public static void main(String[] args) {//자바의 메소드는항상 객체안에 있어야한다
		useDrill(new Drill() { //드릴객체를 즉석에서 생성해서  밑에있는 메소드에 전달했다
								//드릴인터페이스에는 강제로 홀이라는 메소드를 강제로 오버라이딩해야되서 
							//완성을해서 전달을한다   드릴타입의 참조값을 전달했을뿐이다
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 뚤어요");
				
			}
			
		});
		//간략한 표현식 추상메소드가 오직 1개인 인터페이스에 한해서  줄인표현가능
		useDrill(()->{
			System.out.println("천장에 구멍을 뚤어요");
		});

	}
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
		
	}

}
