package coffee;

public class CoffeeByNumber {
	
	public int waitingNumber;
	
	public CoffeeByNumber(int waitingNumber) {
		this.waitingNumber=waitingNumber;
	}
	
	public void ready() {
		System.out.println("커피준문 완료 ㅣ INT "  +waitingNumber );
	}
}
