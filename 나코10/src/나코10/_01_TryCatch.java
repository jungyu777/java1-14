package 나코10;

public class _01_TryCatch {

	public static void main(String[] args) {
		//예외처리
		/*
		 * 오휴 : 컴파일오류 :코드에 오류가 있어서 프로그램이 실행조차 되지 않는 경우 int i ="문자열";
		 * 런타임 오류 : int[] arr = new int[3]  arr[5] =100;
		 * 					크기가3인데 5인덱스에 값을 집어 넣을려고하면 컴파일떄는 에러가 나지 않지만 실행하면 에러가난다
		 * 	런타임 오류 (에러 error , 예외 exception ) 
		 * 에러 error : 우리가 작성하는 소스코드를 통해서 수습을 할수없는 것
		 * 예외 exception :  우리가 작성하는 코드들로 수습이 가능한것
		 */
		try {
			//우리가 시도하려는 코드를 작성 
			//System.out.println(3/0);
//			int[] arr = new int[3];
//			arr[5]=100;
			
			Object obj = "test";
			System.out.println((int)obj);
		}catch(Exception e) {//문제가 발생하면 이곳에서 처리 또는 어떤문제가 발생했는지를 출력해준다
			System.out.println("이런 문제가 발생했어요 =>" + e.getMessage());
			e.printStackTrace();
		}

	}

}
