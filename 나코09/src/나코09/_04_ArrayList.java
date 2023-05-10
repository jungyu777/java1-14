package 나코09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {

	public static void main(String[] args) {
		//컬렉션 프레임워크 
		//많은 데이터를 쉡고 편리하게 효과적으로 관리 클래스 들의 모음
		//배열같은 경우는 크기가 고정되지만 
		//컬렉션 프레임워크는 배열과는 다르게 원하는 만큼 얼마든지 데이터를 추가하거나 추가된 데이터를 삭제 가능하고
		//컬렉션내에 데이터가 추가되어있는지 탐색을 한다거나 정렬을 하는등 다양한 기능을 제고
		//List , set , Map
		ArrayList<String> list = new ArrayList<>();
		//데이터 추가
		list.add("유재석");
		list.add("조세호");
		list.add("김종국");
		list.add("박명수");
		list.add("강호동");
		System.out.println("------------------------------------------------------------");
		//데이터 조회
		System.out.println(list.get(0)); // 유재석
		System.out.println(list.get(1));  
		System.out.println(list.get(2));  
		System.out.println(list.get(3));  
		System.out.println(list.get(4));  
		//삭제 박명수 remove
		System.out.println("신청학생수   " + list.size());
		list.remove("박명수");
		System.out.println("신청학생수 삭제후   " + list.size());
		System.out.println(list.get(3));
		
		System.out.println("------------------------------------------------------------");
		System.out.println("남은 학생수 (제외전) : " + list.size());
		list.remove(list.size() -1);
		System.out.println("남은 학생수 (제외 후) : " + list.size());
		System.out.println("------------------------------------------------------------");
		//순회 
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("------------------------------------------------------------");
		//변경 
		System.out.println("수강권 양도 전 "  +  list.get(0));
		list.set(0, "이수근");
		System.out.println("수강권 양도 후 " + list.get(0));
		//확인
		System.out.println("------------------------------------------------------------");
		System.out.println(list.indexOf("김종국"));
		//선착순 5명 내에 포함되었는가?
		if(list.contains("김종국")) {
			System.out.println("수강신청 성공");
		}else {
			System.out.println("수강신청실패");
		}
		System.out.println("------------------------------------------------------------");
		
		//전체삭제
		list.clear();
		if(list.isEmpty()) {
			System.out.println("학생수 ㅣ " + list.size());
			System.out.println("리스트가 비었습니다");
		}
		
		list.add("유재석");
		list.add("조세호");
		list.add("김종국");
		list.add("박명수");
		list.add("강호동");
		//정렬 가나다 순으로 정렬
		Collections.sort(list);
		for(String s : list ) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
	}

}
