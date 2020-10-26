package domain;

public class Course {
	private Integer courseid;
	private String coursename;
	private String coursespace;
	private String time;
	private String teacher;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(Integer courseid, String coursename, String coursespace, String time, String teacher) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.coursespace = coursespace;
		this.time = time;
		this.teacher = teacher;
	}

	public Integer getCourseid() {
		return courseid;
	}

	public void setCourseid(Integer courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getCoursespace() {
		return coursespace;
	}

	public void setCoursespace(String coursespace) {
		this.coursespace = coursespace;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", coursespace=" + coursespace
				+ ", time=" + time + ", teacher=" + teacher + "]";
	}
	
	
}
