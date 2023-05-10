package test.main;

import test.util.MyUtil;

public class MainClass09 {

	public static void main(String[] args) {
		//static 메소드는 new 필요없이 상속받은 static 클래스명 . 찍고 바로 호출할수있다
		//물론 부모클래스 baseutil 도 할수있다
		//상속받은 BaseUtil 클래스에 정의된 static 메소드도 모두 사용가능하다
		MyUtil.light();
		MyUtil.clear();
		MyUtil.send();

	}

}
