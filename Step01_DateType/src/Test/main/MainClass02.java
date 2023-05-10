package Test.main;

/*
 *  주석에 표기된것 대로 코딩을 완성해 보세요.
 */
public class MainClass02 {
	public static void main(String[] args) {
		//1.콘솔창에"main 메소드가 시작되었습니다:."를 출력해보세요
		System.out.println("main 메소드가 시작되었습니다:.");
		//2.국어 점수 95를 kor 이라는 변수에 담아보세요
		int kor = 95;
		//영어 점수 100을 eng 라는 변수에 담아보세요
		int eng =100;
		//국어 점수와 영어 점수의 평균을 구해서(연산자활용) avg라는 변수에 담아보세요
		//정수끼리 연산하면 정수만나옴 둘중하나라도 실수가 나와야한다
		double avg =(kor+eng)/2d;
		
		//콘솔창에 avg 변수안에 담긴 내용을 출력해보세요
		System.out.println(avg);
	}
}
