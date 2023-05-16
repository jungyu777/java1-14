package test.main;

import java.util.Scanner;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class QuizMain04 {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println( "검색할 dept 테일 번호 입력하세요");
		
		int deptno = scan.nextInt();
		DeptDto dto = new DeptDao().getData(deptno);
		if(dto != null) {
			System.out.println(deptno + " 번 회원의 이름은 : " + dto.getDname() + " 주소는  " + dto.getLoc());
		}else {
			System.out.println(deptno + " 번 회원은 존재 하지 안습니다");
		}
	}
}
