package Test.main;
/*
 * [java 기본 데이터 type]
 * 
 * 2.논리형 [boolean]
 * 
 * -true,false 두가지 값중 하나이다,
 * -true ,false 를 직접 쓰거나 비교연산 혹은 논리연산의 결과로 얻어낼수있다.
 * -참과 거짓을 나타내는 데이터 type
 */

public class MainClass03 {
	public static void main(String[] args) {
		//논리형 변수 선언과 동시에 값 대입하기
		boolean isRun = false;
		
		if(isRun) {
			System.out.println("달려요");
		}
		//비교연산의 결과로 얻어진 boolean 값 담기
		boolean isGreater=10>1;
		//논리연산의 결과로 얻어진 boolean 값 담기
		boolean result=true||false;
		boolean result2=false||false;
		System.out.println(isGreater);
		System.out.println(result);
		System.out.println(result2);
		//변수에 다른 값을 대입 할수 있다 (동일한 type인 경우)
		result =false;
		//다른 type 값은 변수에 담을수 없다
		//result=10;
		
		System.out.println(result);
		result=true;
		System.out.println(result);

	}
}
