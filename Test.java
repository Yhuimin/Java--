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
		//通过teacher类的set方法设置教授课程，通过实参course调用
		teacher.setTeachcourse(course);
		//通过student类的set方法设置所选课程，通过实参course调用
		student.setChoosecourse(course);
		//通过获取课程名称来判断学生是否退课
		if(course.getCoursename()==null){
			System.out.println("该学生已退课");
		}
		//System.out.println(teacher.toString());
		//调用student类的toString方法打印输出学生选课信息
		System.out.println(student.toString());
				
	}

}

