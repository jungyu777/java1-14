package juntest.main;

import test.mypac.Camera;
import test.mypac.FactoryCam;
import test.mypac.SpeedCam;

public class Main01 {
	public static void main(String[] args) {
		//abstract: 직접 객체를 생성하지 못하도록 할수있다
		//Camera camera = new Camera();   카메라는 객체를 만들수가 없다  추상클래스 이기 떄문에
		//추상클래스를 상속한 자식 클래스의 
		//데이터 추상화를 위해서 보여줄건 보여주고 숨길건 숨기기위해서 추상클래스를 만들수 있는데
		FactoryCam factoryCam = new FactoryCam();
		factoryCam.showMainFeature();
		
		SpeedCam speedCam = new SpeedCam();
		speedCam.showMainFeature();
		
	}
}
