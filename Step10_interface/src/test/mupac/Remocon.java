package test.mupac;
/*
 * [interface]
 * 
 * -생성자가 없다(단독객체생성불가)
 * -구현된 메소드는 가질수 없다(추상 메소드만 가질수 있다)
 * -필드는 static final 상수만 가질수 있다
 * -data type 의 역활을 할수 있다
 * -interface type 의 참조값이 필요하면 구현 (implements) 클래스를 만들어서
 *  객체를 생성해야 한다.
 * -클래스 상속은 단일 상속이지만, 인터페이스는 다중구현이 가능하다
 */

public interface Remocon {
	//인터페이스는 추상메소드만 가질수있다, 미완성메소드
	//필드는 static final 필드만 가질수 있다 (static final은 생략가능)
	public static final String COMPANY="LG";
	public void up();
	public void down();
	
}
