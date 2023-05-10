package 나코10;

public class _04_Finally {

	public static void main(String[] args) {
		
		//문제가 발생하건 말건 상관없이 무조건 수행되어야되는 문장을 Finsally을 이용해서 처리한다
		//정상 종료가 되든 에러가 발생하든 무조건 try문 마지막으로 Finsally 구문이 실행된다
		try {
			System.out.println("택시의 문을 연다");
			throw new Exception("휴무택시");
			//System.out.println("택시에 탑승한다.");
		}catch(Exception e) {
			System.out.println("!! 문제발생  :  " + e.getMessage());
		}finally {
			System.out.println("택시의 문을 닫는다");
		}
		
		/*
		 * try + catch
		 * try + catch + finally
		 * try + finally
		 */
		System.out.println("-------------------------");
		try {
			System.out.println(3/0);
		}finally {
			System.out.println("프로그램 정상종료");
		}

	}

}
