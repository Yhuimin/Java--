package beishihua;

import domain.Course;
import domain.Person;
import domain.Student;
import domain.Teacher;

public class Test {

	public static void main(String[] args) {
		//实例化类
		Person person = new Person();
		Teacher teacher = new Teacher(3,"小麦","女");
		Student student = new Student(55,"木木","女");
	  //Course course = new Course(1,null,"教室204","晚7点","张老师");
		Course course = new Course(1,"Java","教室204","晚7点","张老师");
		teacher.setTeachcourse(course);
		student.setChoosecourse(course);
		if(course.getCoursename()==null){
			System.out.println("该学生已退课");
		}
		//System.out.println(teacher.toString());
		System.out.println(student.toString());
				
	}

}
