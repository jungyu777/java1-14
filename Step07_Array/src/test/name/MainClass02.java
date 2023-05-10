package test.name;

import java.util.Arrays;

public class MainClass02 {

	public static void main(String[] args) {
		//0으로 초기화된 방 3개짜리 int [] 객체 만들어서 참조값을 지역변수 nums에담기
		int[] nums = {0,0,0};
		//0번방에 10,1번방에20,2번방에30을 저장해보세요
		
		//대입할곳을 지칭 지역변수 or 어떤객체의 필드 or 배열의 특정 index해당하는방  = 넣을값;
		 nums[0]=10;
		 nums[1]=20;
		 nums[2]=30;
		 
		 
		 
		 //0 으로 초기화된 방 500개짜리 int[] 객체 만들어서 참조값을 지역변수 nums2에 담기
		 int[] nums2 = new int[501];
		 /*
		  * 0번방에 1
		  * 1번방에 2
		  * 2번방에3
		  * 
		  * 499번방에 500을 저장해보세요
		  */
	
//		 nums2[0] =1;
//		 nums2[1] =2;
//		 nums2[499] =500;
		 for(int i = 0 ;i < nums2.length ;i++) {
			//배열의 
			 System.out.println(nums2[i]=i+1);
		 }
		 System.out.println(Arrays.toString(nums2));
		//for(배열타입선언 i=0;i<반복횟수;i++
	}

}
