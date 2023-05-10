package test.maun;

import test.mypac.ham;
import test.mypac.hamchees;
import test.mypac.hamslmp;

public class Quiz01 {

	public static void main(String[] args) {
		
				/*
				 * 햄버거의 종류는 햄버거 치즈버거 새우버거 3가지
				 * 각 버거는 각각의 클래스로 생성
				 * 버거이름을 담기 위한 name 변수정의
				 * 재료정보를 표시하는 cook()메소드 정의
				 * 공통부분의 상속 및 메소드 오버라이딩으로 처리
				 * 모든 클래스는 하나의 파일에 정의
				 */
		
		hamslmp[] h1 = new hamslmp[3];
		h1[0] = new ham();
		h1[1] = new hamchees();
		

	}

}
