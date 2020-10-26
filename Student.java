package domain;

public class Student extends Person{
		
	//建立两者的联系，就是可以在Student类中调用Course类的东西
	//choosecourse不是Student的属性
	private Course choosecourse;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}	
			
	public Student(int id1, String name1, String sex1) {
		super(id1, name1, sex1);
		// TODO Auto-generated constructor stub
	}

	public Course getChoosecourse() {
		return choosecourse;
	}

	public void setChoosecourse(Course choosecourse) {
		this.choosecourse = choosecourse;
	}

	@Override
	public String toString() {
		return super.toString()+"Student [choosecourse="+ choosecourse + "]";
	}
	
	
						
	
}
