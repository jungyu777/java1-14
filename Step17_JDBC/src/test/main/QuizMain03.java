package test.main;

import java.util.List;

import test.dao.Empdao;
import test.dto.Empdto;

public class QuizMain03 {

	public static void main(String[] args) {
//		List<DeptDto> list = new DeptDao().getList();
//		for(DeptDto tmp:list) {
//			System.out.println(tmp.getDeptno() + " | " + tmp.getDname() + " | " + tmp.getLoc());
//		}
		
		List<Empdto> list = new Empdao().getList();
		for(Empdto tmp: list) {
			System.out.println(tmp.getEmpno()+ "|" + tmp.getEname()+ "|" +tmp.getDeptno()+ "|"+ tmp.getMgr());
		}

	}

}
