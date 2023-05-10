package test.main;

import java.util.HashMap;

import test.mypac.Car;
/*
 * java에서 어떤 데이터를 key :value 의 쌍으로 관리하고 싶으면 
 * HashMap 객체를 사용한다.
 * key의 generic 도 마음대로 지정할수 있지만 보통String type 으로한다
 * values 의 generic 은 그떄그떄 다르지만 value가 여러가지 type 이면
 * Onject로 한다
 */

public class MainClass06 {

	public static void main(String[] args) {
		HashMap<String, Object> map1 = new HashMap<>();
		//HashMap 은 제너릭이 2개
		//key 값 ,  value 의 제너릭
		//문자열을 키값으로해서  원하는 어떤 Type 의 value 도 저장할수 있다.
		map1.put("num", 1);
		map1.put("car", new Car("소나ㄷ타"));
		/*
		 * value 의 Generic 클래스가 Object 로 지정되어 있기떄문에
		 * 리턴되는 Object type 을 원래 type 으로 casting 해야한다.
		 */
		
		int num = (int) map1.get("num");
		String name = (String)map1.get("name");
		
		Car car = (Car) map1.get("car");
		
		//동일한 key 값으로 다시 담으면 수정
		map1.put("name", "에이콘");
		//특정 key 값으로 담긴 내용 삭제, 성공하면 true , 실패하면 false 리턴
		map1.remove("isMan");
		//모두삭제
		map1.clear();
		
		
		

	}

}
