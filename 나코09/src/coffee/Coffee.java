package coffee;

public class Coffee <T>{
	public T name;
	public Coffee(T name) {
		this.name=name;
	}
	public void ready() {
		  System.out.println("커피 주문 완료 ㅣ 제리닉스" + name);
	}

}
