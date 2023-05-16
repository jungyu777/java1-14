package test.main;

import java.util.ArrayList;
import java.util.List;

import test.dao.DeptDao;
import test.dao.MemberDao;
import test.dto.DeptDto;
import test.dto.MemberDto;

public class MainClass16 {

	public static void main(String[] args) {
		//모든 회원의 정보를 얻어오고 싶다면?
		List<MemberDto> list = new MemberDao().getList();
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum() + " | " + tmp.getName() + " | " + tmp.getAddr());
		}
	

	}

}
