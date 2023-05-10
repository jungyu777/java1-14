package 나코09;

import java.util.HashMap;

public class _07_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		//맵 : 중복 x , 순서 :x 만약 똑같은 값이 들어가게된다면 나중에 입력괸게 들어감
		//데이터 추가
		map.put("유재석", 10);
		map.put("박명수", 5);
		map.put("김종국", 3);
		map.put("서장훈", 15);
		
		System.out.println("총 고객 수 : " + map.size());
		System.out.println("------------------------------------------");
		
		//조회  key값을 얻어옴 get("유재석")  : 0 번방에있는 value값을 불러옴
		System.out.println(map.get("유재석"));
		System.out.println(map.get("박명수"));
		System.out.println("------------------------------------------");
		//확인
		if(map.containsKey("서장훈")) {  //만약 서장훈이 map에 있다면
			int point =  map.get("서장훈"); //map.get(Object) 를 point에 담고
			map.put("서장훈", ++point);	// 서장훈에 value 에다가 1을 추가
			System.out.println(" 서장훈님의 누적 포인트는  : " + map.get("서장훈"));
		}else {
			map.put("서장훈", 1);
			System.out.println("서장훈님 신규등록 (포인트 + 1 )");
		}
		System.out.println("------------------------------------------");
		
		//삭제 
		map.remove("유재석");
		System.out.println(map.get("유재석"));
		
		//전체삭제
		map.clear();
		if(map.isEmpty()) {
			System.out.println("남은 고객 수  : " + map.size());
		}
		
		System.out.println("------------------------------------------");
		map.put("유재석", 10);
		map.put("박명수", 5);
		map.put("김종국", 3);
		map.put("서장훈", 15);
		
		//key 확인 
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println("------------------------------------------");
		//valte 확인
		for(int value : map.values()) {
			System.out.println(value);
		}
		System.out.println("------------------------------------------");
		//map.get() 에다가 key값을 넣으면 value 값이나옴
		//ket value를 함꼐 확인
		for (String key : map.keySet()) {
			System.out.println("고객이름은 : " + key + "\t포인트는(value 값) : " + map.get(key));
		}
		System.out.println("------------------------------------------");	
		map.put("김종국", 10);
		map.put("김종국", 30);
		map.put("김종국", 50);
		for (String key : map.keySet()) {
			System.out.println("고객이름은 : " + key + "\t포인트는(value 값) : " + map.get(key));
		}
		System.out.println("------------------------------------------");	
	}

}
