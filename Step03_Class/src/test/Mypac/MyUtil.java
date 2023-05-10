package test.Mypac;

public class MyUtil {
	// static 메소드는 static 영역에 만들어진다
	//static 메소드=> MyUtil클래스안에 => send메소드가 들어있다
	//static 메소드를 찾아갈려면 (클래스명에.메도스명(); 을 찍어서 사용하면된다)MyUtil.send();
	//정말하나만 있어도 된다면 static 으로 만들어라 
	//static 메소드는 오직 하나
	//static 은 
	//STATIC 예약어를 사용하지않은  메소드는 NEW를 하지 않으면  설계도 (실체화가안되어있다)
		//static에서의 this는 의미가없다
		
		//THIS라는 예약어는 객체안에서 의미가있다
	public static String version="1.0.0";
	
	public static void send() {
		System.out.println("전송합니다.");
	}
	

}
