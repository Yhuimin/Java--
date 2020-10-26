package domain;

public class Person {
	
	private Integer id1;
	private String name1;
	private String sex1;
		
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id1, String name1, String sex1) {
		super();
		this.id1 = id1;
		this.name1 = name1;
		this.sex1 = sex1;
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getSex1() {
		return sex1;
	}

	public void setSex1(String sex1) {
		this.sex1 = sex1;
	}

	//toString()方法就是起输出和打印的作用
	@Override
	public String toString() {
		return "Person [id1=" + id1 + ", name1=" + name1 + ", sex1=" + sex1 + "]";
	}

}
