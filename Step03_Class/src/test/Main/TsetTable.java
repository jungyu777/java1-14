package test.Main;

import test.Mypac.Table;


public class TsetTable {

	public static void main(String[] args) {
		Table tab1 = new Table();
		tab1.name="슬리퍼";
		tab1.color="black";
		tab1.price=20000;
		tab1.year=1993;
		//table clsss의 객체를 tab1으로 만들고 그 클래스 안에있는 객체들의 값을 대입해서
		//호출하기 만약 tab1.getTable(); 처럼 함수가 만들어져 있는 상태라면 
		//만든 객체이름.만들어 놓은 함수 호출하면 그 새로만든객체에 만들어져있는 함수가 호출됨
		tab1.getTable();
		System.out.println(tab1.year);
		Table tab2 = new Table();//tab2객체만 만들고 아무런값도 주지 않은상태
		tab2.name="김구라";
		System.out.println(tab2.name);
		//위에서 처럼 import test.Mypac.table;에서 기본값만 들어있는 메소드를 복제해서
		// 호출하면 기본값만 들어있음 여기서 tab2 에 값을 넣는건 tab2에만 적용됨	
		
		//tab1과 다르게 불러오는 클래스에서 값을 미리 주고 호출만하면 값이 정해져있는체로 호출됨
		
		
		tab1.showInfo();

	}

}
