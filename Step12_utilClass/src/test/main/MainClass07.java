package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass07 {

	public static void main(String[] args) {
		/*
		 * 세명의 회원정보를(번호 이름 주소) HashMap 객체에 각각 담아서 
		 * 
		 * ArrayList 객체에 누적시켜보세요
		 * 
		 * 반복문 돌면서 ArrayList 객체에 누적된 회원정보를 콘솔창에 순서대로 출력해 보세요.
		 * 
		 * HashMap 객체3개, ArrayList 객체 1개가 생성이 되어야 합니다
		 * 
		 * ArrayList 객체안에 HasgMap 을 담을 예정이니
		 * 
		 * List<HashMap<String , Object> type 필요합니다
		 */
	
		List<Map<String , Object>> list = new ArrayList<>();
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("num", 1);
		map1.put("name", "김구라");
		map1.put("addr", "ㅎ노량진");
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("num", 2);
		map2.put("name", "해골");
		map2.put("addr", "행신동");
		Map<String, Object> map3 = new HashMap<>();
		map3.put("num", 3);
		map3.put("name", "원숭이");
		map3.put("addr", "상도동");
		
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		for(Map<String, Object> tmp :list ) {
			 // 번호
	         int num=(int)tmp.get("num");
	         //이름
	         String name=(String)tmp.get("name");
	         //주소
	         String addr=(String)tmp.get("addr");
	         System.out.println("num:"+num+", name:"+name+", addr:"+addr);

			//System.out.println(tmp);
		}
		
		
				

	}

}
