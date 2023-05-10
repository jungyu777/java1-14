package test.main;

import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		new Student();  //생성자호출 System.out.println("Student 클래스의 default(기본) 생성자 호출됨");
		new Student().study();//System.out.println("공부해요!");

		//위에는 객체를 담지않고 일회용으로 사용
		//아래는 객체를 s1에 담아서 사용
		Student s1 = new Student();
		s1.study();
	}
}
