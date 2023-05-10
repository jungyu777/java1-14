package Test.main;
/*
 * [java 참조 데이터 type]
 * 
 * String type
 * 
 * -문자열을 다룰떄 사용하는 데ㅌ이터 type
 */

public class MainClass05 {
	public static void main(String[] args) {
		//main 메소드 안에 있는 변수는 지역변수
		//각변수마다 사물함과 사룸함 키가 생기는데
		//"김구라" 라는 String type 객체를 heap 영역(사물함)에 만들고 그 참조값을 변수에 담기
		String name ="김구라";
		//name 안에 있는 참조값을 tmp 변수에 복사해주기
		String tmp=name;
		//"원숭이" 라는 String type 객체를 heap 영역에 만들고 그 참조값을 name 변수에 덮어쓰기
		name = "원숭이";
		System.out.println(tmp);
		//name 변수를 비우기 ( null 은 참조 데이터 type 이 담길수 있는 빈공간을 의미한다)
		name=null; //공간은 존재하지만 값이 존재하지 않는 상태 null 
		System.out.println(name);
		
	}
}
