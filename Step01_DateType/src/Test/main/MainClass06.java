package Test.main;

public class MainClass06 {

	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//지역변수는 값을 넣지 않고 선언만 하면 만들어 지지 않는다
		//기본데이터 타입에는 null을 담을수없다
		int num;
		// 공간이 만들어질려면 값을 대입해야한다
		// 참조데이터 타입에빈 공간을 만들려면 null울 집어넣어라
		String name1;
		
		//아직  만들어 지지 않았기 떄문에 num1 은 참조 불가
		//int resilt=10+num1;
		//아직 만들어 지지 않았기 때문에 name1은 참조 불가
		//System.out.println(name1);
		System.out.println("main 메소드가 종료 됩니다.");

	}

}
