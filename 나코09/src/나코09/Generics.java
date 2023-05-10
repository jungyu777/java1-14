package 나코09;

public class Generics {

	public static void main(String[] args) {
		//제네릭스 : 다양한 타입의 객체를 지원하는 클래스나 인터페이스 또는 메소드를 정의하는 방법
		//똑같은 동작을 하는 클래스나 메소드를 여러번 만들필요없이 딱 한번만 정의하고나서 여러 타입에 대해서 지원해준다
		Integer[] iArray = {1,2,3,4,5};
		Double[] dArray = {1.0,2.0,3.0,4.0,5.0};
		String[] sArray = {"A","B","C","D","E"};
		
		printIntArray(iArray);
		printDoubleArray(dArray);
		printStringArray(sArray);
		
		System.out.println("---------------------------------------------------------"); 
		//제네릭스에서 지원하는건 객체 자료형이다   기본 자료형인 int 와 double를 제네릭스로 호출할려면
		//참조자료형으로 변형 시키거나 참조자료형으로 배열을 만들어야 한다
		printAnyArray(iArray);
		printAnyArray(dArray);
		printAnyArray(sArray);
	
	}
	//제네릭스메소드
	//T : Type  K : Key  V: Value E : Element
	private static <T> void printAnyArray(T[] array) {
		for(T t:array) {
			System.out.print(t+"  ");
		}
		System.out.println();
		
	}
	
	
	
	public static void printIntArray(Integer[] iArray) {
		for(int i:iArray) {
			System.out.print(i+"  ");
		}
		System.out.println();
	}
	public static void printDoubleArray(Double[] dArray) {
		for(double d:dArray) {
			System.out.print(d+"  ");
		}
		System.out.println();
	}
	
	public static void printStringArray(String[] sArray) {
		for(String s:sArray) {
			System.out.print(s+"  ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	

}
