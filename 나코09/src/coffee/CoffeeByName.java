package coffee;

public class CoffeeByName {
	public Object name;
	public CoffeeByName(Object name) {
		this.name=name;
	}
	public void ready() {
		System.out.println("커피주문 완료 Object" + name);
	}
}
