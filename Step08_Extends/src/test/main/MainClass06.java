package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass06 {

	public static void main(String[] args) {
		//자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1 = new HandPhone();
		//엄마 나도  AndroidPhone 사줘
		//엄마가 새로운 설명설ㄹ 가지고 와서 이제 원래있던폰이 안드로이드 폰이야 라고 한꼴
		AndroidPhone p2 = (AndroidPhone)p1; // ClssCastException
		
		//진짜?  엄마 짱이다
		//나 이제 인터넷한다
		p2.doInternet();
		

	}

}
