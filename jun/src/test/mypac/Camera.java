package test.mypac;

public abstract class Camera {
	public void takePicture() {
		System.out.println("사진을 촬영합니다");
	}
	public void recordVideo() {
		System.out.println("동영상을 녹화합니다");
	}
	
	public abstract void showMainFeature();
	//추상클래스에서 정의하는 추상메소드는 이름만 적어주고 메소드를 완성하지 않는다
	//Crmera 를 상속하는 자식클래스에서 이 메소드를 구현하도록 해준다

}
