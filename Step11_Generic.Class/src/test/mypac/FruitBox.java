package test.mypac;
/*
 * 클래스 안에서 사용하는 특정 type 을 고정하지 않고
 * 
 * 클래스를 사용하는 시점에 type 을 정할수 있게 할수 있다.
 * 
 * -아래 선언한 T는 마음대로 스펠링이나 단어를 정할수 있다.
 * 보통type 이라는 의미에서 T라고 많이 정한다.
 * -T를 포괄 클래스(Generic Class)라고 한다
 */

//가상의 과일박스
public class FruitBox<T> {//클래스 내부에서 사용할 타입을 전달함<T> 포괄클래스 제너릭클래스
	//클래스가 정해지지 않았고 사용할떄 정한다
	//필드
	private T item;
	//과일을 포장하는 메소드 애플타입에 값을 저장해서 필드에 전달해주는 메소드
	public void pack(T item) { // (new Apple())
		this.item = item;
	}
	//과일을 리턴하는 메소드 unpack는 apple 타입을 리턴해준다
	public T unPack() {
		return item;
	}
	
}
