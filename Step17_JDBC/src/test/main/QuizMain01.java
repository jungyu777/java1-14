package test.main;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class QuizMain01 {

	public static void main(String[] args) {
		//수정
		int deptno=50;
		String dname="이준규";
		String loc="정자동";
		DeptDto dto = new DeptDto();
		dto.setDeptno(deptno);
		dto.setDname(dname);
		dto.setLoc(loc);
		DeptDao dao = new DeptDao();
		boolean result = dao.update(dto);
		if(result) {
			System.out.println(" 수정 되었습니다");
		}else {
			System.out.println("이미 수정했거나. 수정실패했습니다");
		}

	}

}
