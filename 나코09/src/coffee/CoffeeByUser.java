package coffee;

import User.User;

public class CoffeeByUser <T extends User>{
	public T user;
	public CoffeeByUser(T user) {
		this.user=user;
	}
	
	public void ready() {
		System.out.println("커피 주문 완료 : ByUser" + user.name);
		user.addPoint(); 
	}

}
