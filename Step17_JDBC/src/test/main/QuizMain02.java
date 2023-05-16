package test.main;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class QuizMain02 {

	public static void main(String[] args) {
		//삭제
		int deptno=50;
		DeptDto dto = new DeptDto();
		dto.setDeptno(deptno);
		DeptDao dao = new DeptDao();
		boolean result =  dao.delete(deptno);
		if(result) {
			System.out.println("삭제되었ㄱ습니다");
		}else {
			System.out.println("이미 삭제되었거나 , 삭제할수 없습니다");
		}
	}

}
