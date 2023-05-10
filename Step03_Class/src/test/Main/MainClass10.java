package test.Main;

import test.Mypac.Rect;

/*
 * test.Mypac 패키지에 클래스를 하나 만들어보세요
 * 
 * -사각형의 폭(width), 높이(height)를 필드에 저장할수 있어야합니다.
 * -필드에 저장된 폭과 높이를 이용해서 사각형의 넒이를 콘솔창에 풀력하는 기능을 가지고 있어야합니다.
 * -필드와 메소드 모두 non static 으로 만드세요
 * 클래스명, 필드명,메소드명 자유
 */
public class MainClass10 {
	
	public static void main(String[] args) {
		//클래스를 만들었다면 여기에 코드를 추가해서 테스트해보세요
		Rect box = new Rect();
		box.width=100;
		box.height=1000;
		box.showInfo();
	}
}
