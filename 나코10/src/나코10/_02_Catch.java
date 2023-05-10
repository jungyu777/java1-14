package 나코10;

public class _02_Catch {

	public static void main(String[] args) {
		try {
			//우리가 시도하려는 코드를 작성 
			System.out.println(3/0);
//			int[] arr = new int[3];
//			arr[5]=100;
//			
//			Object obj = "test";
//			System.out.println((int)obj);
			
//			String s = null;
//			System.out.println(s.toLowerCase());
			
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println("두개 동시에 처리할수있는 catch문");
//		}catch(ArithmeticException e) { 
//			//System.out.println(3/0);
//				System.out.println("잘못 계산하셨네요");
//		}catch(ArrayIndexOutOfBoundsException e){    
//			int[] arr = new int[3];
//			arr[5]=100
			System.out.println("인덱스를 잘못 설정했어요");
		}catch(ClassCastException e) {
//			Object obj = "test";
//			System.out.println((int)obj);
			System.out.println("잘못된 형 변환 입니다");
		}catch(Exception e) {//문제가 발생하면 이곳에서 처리 또는 어떤문제가 발생했는지를 출력해준다
			System.out.println("위에 있는 에러외에 모든 에러는 Exception으로 처리가되요 " + e.getMessage());
			e.printStackTrace();
			//Exception 가장 조상클래스
		}

	}

}
