package test.main;

import test.mupac.MyRemocon;
import test.mupac.Remocon;
/* 인터페이스는 상속받는게아니라 구현 클래스를 만든다
 * class 는 extends 하는것이고
 * interface 는 implements 한다
 */

public class MainClass01 {

	public static void main(String[] args) {
		//어떻게 하면 Remocon 인터페이스 type 의 참조값을 얻어낼수 있을끼?
		Remocon r1=new MyRemocon();
		r1.up();
		r1.down();

	}

}
