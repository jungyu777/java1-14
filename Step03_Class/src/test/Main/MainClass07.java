package test.Main;

public class MainClass07 {
	//main메소드는 static 메소드이다.
	//필드 스테틱메소드에서 사용할 필드는 스테틱을 붙여야된다
	//static 메소드에서 사용하려면 static 필드로 만들어야 한다.
	public static int num=999;
	
	public static void main(String[] args) {
	//지역변수
		int result =num+1;
		
		
		//클래스명.필드명 형식으로 static 필드를 참조한다
		int result1 = MainClass07.num+1;

		//main()메소드와 num필드는 둘다 mainClass07 안에 속해 있으므로(같은공간) 클래스명.은 생략가능하다
		int result2 = num+1;
		//아래에 정의한 test() 메소드는 호출가능할까?
		MainClass07.test();
		test();//MainClass07이 생략되어있다 원본 : MainClass07.test();
	}
	public static void test() {// static 예약어가 붙지않은 메소드는 설계도에불과하다 
		//애는 new를 해야지만 실체화가된다
		System.out.println("test() 메소드가 호출되었습니다.");
	}

}
