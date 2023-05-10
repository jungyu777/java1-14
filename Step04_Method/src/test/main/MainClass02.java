package test.main;

import test.mypac.Airplane;
import test.mypac.Test;

public class MainClass02 {
	
	public static void main(String[] args) {
		Test t = new Test();
		//메소드 오버로딩
		t.send();
		t.send(10);
		t.send("ㅌㅌㅌㅌ");
		t.send(new Airplane());
		t.send("ㅈㅈㅈ",2222,new Airplane());
		
		//참조되는 값을 전달 할수도 있다.
		int a = 999;
		t.send(a);
		t.send("a",a,new Airplane());
		
		String b = "하이";
		t.send(b);
		
		Airplane c = new Airplane();
		t.send(c);
		
		t.send(b,a,c);
		
	}
}
