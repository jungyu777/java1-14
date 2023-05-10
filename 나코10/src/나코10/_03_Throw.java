package 나코10;

public class _03_Throw {

	public static void main(String[] args) {
		
		/*
		 * 프로그램이 실행되는 과정에서 우리가 의도적으로 원하지 않는 데이터 원하지 않는 결과가 나왔을떄 필요에 의해서
		 * 이런 예외를 만들어서 던질수도있다
		 * 
		 * throw new Exception("만 19세 미만에게는 판매하지않습니다"); 여기서 던지면
		 * catch(Exception e) {
			e.printStackTrace(); 여기서 받는다
		 */
		int age=17; 
		try {
			if(age<19) {
				
				//System.out.println("만 19세 미만에게는 판매하지않습니다");
				throw new Exception("만 19세 미만에게는 판매하지않습니다");
			}else {
				System.out.println("주문하신 상품 여기 있습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
