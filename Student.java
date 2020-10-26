package domain;

public class Student extends Person{
		
	//建立两者的联系，就是可以在Student类中调用Course类的东西
	//choosecourse不是Student的属性
	private Course choosecourse;
	Teacher t1;
	//无参构造方法
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}	
	//有参构造方法		
	public Student(int id1, String name1, String sex1) {
		super(id1, name1, sex1);
		// TODO Auto-generated constructor stub
	}
	//调用get方法获取选课信息
	public Course getChoosecourse() {
		return choosecourse;
	}
	//调用set方法设置选课信息
	public void setChoosecourse(Course choosecourse) {
		this.choosecourse = choosecourse;
	}
	public Teacher getT1() {
		return t1;
	}
	public void setT1(Teacher t1) {
		this.t1 = t1;
	}
       //打印输出学生信息
	@Override
	public String toString() {
		return super.toString()
				+"\nStudent [choosecourse="+ choosecourse + "]\n"
				+t1;
	}
	
						
	
}
