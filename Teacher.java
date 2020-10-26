package domain;

public class Teacher extends Person{
		//继承了Person类的相同属性（id name sex），可以不用再写
		/*
		private Integer  tchid;
		private String tchname;
		private String tchsex; 
		*/
	
		private Course teachcourse;
		
		public Teacher() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Teacher(int id1, String name1, String sex1) {
			super(id1, name1, sex1);
			
		}

		public Course getTeachcourse() {
			return teachcourse;
		}

		public void setTeachcourse(Course teachcourse) {
			this.teachcourse = teachcourse;
		}

		@Override
		public String toString() {
			return super.toString()+"Teacher [teachcourse=" + teachcourse + "]";
		}

		

		
				

}
