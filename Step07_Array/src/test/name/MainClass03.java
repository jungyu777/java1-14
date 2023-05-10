package test.name;

public class MainClass03 {

	public static void main(String[] args) {
		//1. String type 을 담을수 있는 방 3개짜리 빈 배열 객체를 만들어서 참조값을 지역변수 names에담기
		String[] names = new String[3]; //{"관백","이준","휘용"}; {null,null,null}
		//2. 3개의 방에 순서대로 친구의 이름을 담아보세요
		names[0]="관백";
		names[1]="이준";
		names[2]="휘용";		
		//3.배열에 들어있는 친구의 이름을 하나씩 순서대로 콘솔창에 출력해보세요
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		for(int i =0;i<names.length;i++) {
			System.out.println(names[i]);
		}

	}

}
