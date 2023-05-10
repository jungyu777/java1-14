package test.main;
/* 중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요중요
 * java 에서 배열은 크기를 조절할수 없는 고정배열이다.
 * 
 * 따라서 동적으로 item 을 추가하고 삭제하고 하는 작업을 하려면 일반배열은 사용할수 없다.
 * 
 * 그래서 해당 작업을 하려면ArrayList 객체를 사용하면된다
 * 
 * ArrayList는 기본데이터 타입은 담을수없고 기본데이터타입을 객체형으로 바꿔서 담아야한다
 *  
 * ArrayList는 참조데이터 타입만 담을수있다
 */

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		//String type 을 저장할수 있는 ArrayList 객체생성해서 참조값을 names에 담아보세요
		ArrayList<String> names = new ArrayList<>();
		//"김구라","해골","원숭이" 3개의 String type 을 정장해보세요
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		//0번방의 아이템을 불러와서 item 이라는 변수에 담아보세요
		String item = names.get(0);
		//1번방의 아이템을 삭제하려면?
		
		names.remove(1);
		//0번방에 "에이콘" 을 넣고 싶으면?
		names.add(0, "에이콘");
		
		//저장된 아이템의 갯수(size)를 size 라는 지역 변수에 담아보세요
		int size = names.size();
		
		//저장된 모든 아이템 전체 삭제
		names.clear();
	}
}
