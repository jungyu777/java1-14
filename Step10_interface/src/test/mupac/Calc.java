package test.mupac;
//계산기 인터 페이스
@FunctionalInterface // 추상메소드를 1개만 만들도록 강제하는역활 (()->{}형태로 사용할수 있도록 보장)
public interface Calc {
	//메소드의 두개의 실수를 전달받아서 어떤 연산을 하고 결과 값을 리턴해주는 메소드
	//어떤 연산을 할지는 개발자가 알아서 정하기
	public double execute(double num1,double num2);
	
	
	
}
