package test.main;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class QuizMain00 {
/*
 * member 테이블을 이용해서 작업했던 내용을 참고해서
 * 
 * dept 테이블에 대해서도 동일한 작업을 해보세요
 * 1.DeptDto 클래스를 만든다.
 * 
 * 2.DeptDao 클래스를 만들어서
 * insert(),update(),delete(),getList(),getData() 메소드를 완성하세요.
 * 
 * 3.완성된 DeptDao 을 테스트 하는 Main 클래스를 만들어서 테스트 해보세요.
 */
	public static void main(String[] args) {
		//추가
		int deptno=50;
		String dname="에이콘";
		String loc="강남역";
		DeptDto dto = new DeptDto();
		dto.setDeptno(deptno);
		dto.setDname(dname);
		dto.setLoc(loc);
		DeptDao dao = new DeptDao();
		
		boolean result = dao.insert(dto);
		if(result) {
			System.out.println(" 저장 되었습니다");
		}else {
			System.out.println(" 이미 저장되어 있는 공간입니다");
		}
	}

}
