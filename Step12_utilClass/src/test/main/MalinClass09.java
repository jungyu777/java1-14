package test.main;
/*
 * while 문을 활용해서 원하는 쇳수만큼 반복하기
 * 
 * -반복 횟수가 명확히 정해져 있으면 for 문으로 반복문을 도는게좋다
 * -반복 횟수가 명확히 정해져 있지 않고 반복을 돌아봐야 횟수를 아는 경우 while문으로 반복문을 도는게 좋다
 */

public class MalinClass09 {

	public static void main(String[] args) {
		//카운트를 셀수있는 변수를 미리 만들어서 0으로 초기화
		int count=0;
		//무한루프로 돌다가
		while(true) {
			System.out.println("안녕!");
			count++;
			//특정 조건 하에서 무한 루프 빠져 나오기
			if(count==5) {
				break;
			}
		}
		System.out.println("-----------------------------------------");
		
		int i=0; //i를 0으로 만들고
		//i가 5보다 작은 동안에 반복문 수행하기
		while(i<5) {
			System.out.println("안녕!!!");
			i++;//i를 1증가 시킨다
		}
		
		
		}
		
		

	}


