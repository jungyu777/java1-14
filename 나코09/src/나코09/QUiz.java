package 나코09;

import java.util.ArrayList;

public class QUiz {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("유재석" , "파이썬"));
		list.add(new Student("박명수" , "자바"));
		list.add(new Student("김종국" , "c"));
		list.add(new Student("조세호" , "c"));
		list.add(new Student("서장훈" , "파이썬"));
		
		System.out.println("----------------------");
		for(Student student : list) {
			if(student.Certification.equals("자바")) {
				System.out.println(student.name);
			}
		}

	}
}
	
class Student{
		public String name;
		
		public String Certification;
		
		public  Student(String name, String Certification) {
			this.name=name;
			this.Certification=Certification;
			
		}
}


