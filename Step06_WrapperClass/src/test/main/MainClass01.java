package test.main;
/*
 * [기본 type 의 참조 data type]
 * 
 * byte : Byte
 * short : Short
 * int : Integer
 * long : Long
 * 
 * float : Float
 * double : Double
 * 
 * char : Character
 * boolean:Boolean
 * 
 * 
 * -때로는 기본데이터 type 의 참조데이터 type 이 필요할떄가 있다.
 * -기본데이터 type 을 객체에 포장(boxing)하는 형태이다
 * -boxing 과 unboxing 은 자동으로 되기 떄문에 프로그래머가 신경을 쓸필요는없다
 */
public class MainClass01 {
	public static void main(String[] args) {
		//기본데이터 타입은 객체를 만들수없고 오직 참조데이터 타입만이 만들어진다
		//기본 데이터 type num1
		int num1= 10;
		//참조 데이터 type num2
		Integer num2=10; //객체안에 10이 포함되어있다
		
		//참조 데이터 type 이지만 기본 데이터 type 처럼 사용할수있다.
		int result1=num2 +1;
		int result2=num1 +num2;
		Integer result3=num1 +num2;
		//인티저 타입으로 자동포장된다
		//JAVA.LANG 패키지는 IMPORT 안해도 사용할수있다
		int result4 = Integer.parseInt("999");//문자열을 넣어주면 인트형이 나온다
		//javascript 에서는 Number("999") 이러면 바뀐다 이걸 담고싶다면 let a = Number("999") 하면된다
		System.out.println(result4);
		
	
		
		
		
		
		
	}
}
