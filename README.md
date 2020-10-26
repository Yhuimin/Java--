# Java--
Java课程作业项目仓库
## 计G201 游慧敏 2020322070
## 实验目的</br>
   初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；</br>
   掌握面向对象的类设计方法（属性、方法）；</br>
   掌握类的继承用法，通过构造方法实例化对象；</br>
   学会使用super()，用于实例化子类；</br>
   掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。</br>
## 实验要求
   1.编写上述实体类以及测试主类（注意类之间继承关系的适用）</br>
   2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；</br>
     模拟学生退课操作，再打印课程信息。</br>
## 实验过程
   1.先创建Person人员封装类，封装编号、姓名、性别三个属性，再创建Student学生类和Teacher教师类，学生类和教师类要继承Person类</br>
   2.创建Course类，封装5个属性（编号、课程名称、上课地点、时间、授课教师），再通过设置get方法获取参数、设置set方法给参数传值，</br>
     利用super设置有参无参构造方法，最后用toString()方法打印信息</br>
   3.建立Student学生类和Teacher教师类以及Course类三者之间的联系</br>
   4.创建测试主类Test类,并实例化多个类实体</br>
   5.选课操作，即通过对象.set属性（实参）方法把参数传过来，然后输出需要的信息即可</br>
   6.学生退课操作，即利用if方法，判断如果获取的课程名称为空，则输出该学生已退课</br>
## 核心代码
```
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
		return super.toString()+"Student [choosecourse="+ choosecourse + "]"+t1;
	}
```
```
		//实例化类
		Person person = new Person();
		Teacher teacher = new Teacher(3,"小麦","女");
		Student student = new Student(55,"木木","女");
	  //Course course = new Course(1,null,"教室204","晚7点","张老师");
		Course course = new Course(1,"Java","教室204","晚7点","momo");
		//通过teacher类的set方法设置教授课程，通过实参course调用
//		teacher.setTeachcourse(course);
		//通过student类的set方法设置所选课程，通过实参course调用
		student.setChoosecourse(course);
		student.setT1(teacher);
		//通过获取课程名称来判断学生是否退课
		if(course.getCoursename()==null){
			System.out.println("该学生已退课");
		}
		//System.out.println(teacher.toString());
		//调用student类的toString方法打印输出学生选课信息
		System.out.println(student.toString());				
	}
```
## 运行结果
![img](https://mail.qq.com/cgi-bin/viewfile?f=190E6AC3D79D5507B9BB824FDE6D10E76F301212134902F00B7388E27AEC765E0A178B355D03228B26A1EF2084EC182C82CAE3D925AB8F15409966DA09F6E781813BDB8A6192B3E048D28753FD54DAED0AD08E265718749B1D54031B7E5DD5B7&mailid=ZL2226-xQyOIGmsglrMlwRbL6rLZaa&sid=B87tD0b6LvZghBdI&net=889192575)

## 编程感想
   此次试验，我了解了类的继承用法；</br>
   学会了通过构造方法实例化对象；</br>
   更深刻的体会到了类的属性、方法；</br>
   体会到了super的一些相关用法，即用super可以调用父类的构造方法；</br>
   掌握了用toString方法打印输出信息。
