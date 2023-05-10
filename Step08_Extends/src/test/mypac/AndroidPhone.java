package test.mypac;

//상속관계 object -> phone-> Handphone-> AndroidPhone
public class AndroidPhone extends HandPhone{
	public AndroidPhone() {
		System.out.println("AndroidPhone 생성자 호출됨");
	}
	
	//메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	
	public void showPlatform() {
		System.out.println("안드로이드 운영체제 입니다.");
	}
	//재정의이가 가능한 메소드 오버라이딩 
	//해당 메소드가 재정의 되었다고 단순히 표시하는 용도이며 특별한 기능을 가지지는 않는다.
	@Override
	public void takePicture() {
		//super.takePicture();//필요없을떄도있고 있을떄도 있다
		System.out.println("2000만 화소로 사진을 찍습니다");
	}
}
