package test.name;
/*
 * java에서 배열도 객체이다
 * 즉 배열은 참조데이터 type 이다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//null은 참조데이터 타입이 담길수있는 빈공간
		
		//javascript 에서는 [10,20,30,40,50] java에서는 {10,20,30,40,50}이다
		
		//int type 5개를 저장하고 있는 배열 객체 생성해서 참조값을 nums 라는 지역변수에담기
		int[]nums = {10,20,30,40,50}; //intarray 기본타입인 1020304050
		//double type5개를 저장하고 있는 배열
		double[]nums2 = {10,20,30,40,50};//doublearray 타입
		//boolean type 5 개를 저장하고 있는 배열
		boolean[]truth ={true,false,false,true,true}; //boolean배열타입
		//String type (참조데이터 type) 5개를 저장하고 있는배열
		String[] names={"김구라","해골","원숭이","주뎅이","덩어리"};
		//총 9개가 만들어진다 int배열,double배열,boolean배열,string배열, 
		//그리고 string 배열에들어있는 string타입의 참조값 5개
		
		
		//배열객체는 clone() 이라는 메소드와 lenght라는 필드가 있다.
		int[] result = nums.clone();
		//배열의 크기 얻어내기
		int size = nums.length;
		//배열은 순서가 있는 데이터 이다. 특정 index의 item 참조하는 방법
		int frist=nums[0];
		int second=nums[1];
		int third=nums[2];
	
		
	}
}
