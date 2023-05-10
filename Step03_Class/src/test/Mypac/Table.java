package test.Mypac;

public class Table {
	//접근제어자/리턴타입 메소드명
	public String name;
	public int price;
	public String color;
	public int year;
	public void getTable() {
		System.out.println("책상");
		System.out.println("다팔렷어요");
		
	}
	public void showInfo() {
		System.out.println("블라블라" + this.color);
	}
		
}
